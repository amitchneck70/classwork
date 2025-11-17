import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class day6{
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("input.txt"));
        int length = lines.get(0).length();
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < length; i++) {
            Map<Character, Integer> freq = new HashMap<>();
            for (String line : lines) {
                char c = line.charAt(i);
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
            char mostCommon = Collections.max(freq.entrySet(), Map.Entry.comparingByValue()).getKey();
            message.append(mostCommon);
        }

        System.out.println(message);
    }
}
