import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class RealRooms {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("input4.txt"));
        int sumSectorIDs = 0;

        for (String line : lines) {
            int lastDash = line.lastIndexOf('-');
            String name = line.substring(0, lastDash);
            String rest = line.substring(lastDash + 1);
            int bracketStart = rest.indexOf('[');
            int sectorID = Integer.parseInt(rest.substring(0, bracketStart));
            String checksum = rest.substring(bracketStart + 1, rest.length() - 1);

            Map<Character, Integer> freq = new HashMap<>();
            for (char c : name.toCharArray()) {
                if (c != '-') freq.put(c, freq.getOrDefault(c, 0) + 1);
            }

            List<Character> letters = new ArrayList<>(freq.keySet());
            letters.sort((a, b) -> {
                int diff = freq.get(b) - freq.get(a);
                return diff != 0 ? diff : a - b;
            });

            StringBuilder topFive = new StringBuilder();
            for (int i = 0; i < 5; i++) topFive.append(letters.get(i));

            if (topFive.toString().equals(checksum)) sumSectorIDs += sectorID;
        }

        System.out.println(sumSectorIDs);
    }
}
