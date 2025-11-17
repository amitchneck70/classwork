import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class BathroomCode {

    public static void main(String[] args) throws IOException {
        List<String> instructions = Files.readAllLines(Paths.get("bathinput.txt"));
        int x = 1, y = 1; // start at '5', which is (row=1, col=1)
        int[][] keypad = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        StringBuilder code = new StringBuilder();

        for (String line : instructions) {
            for (char move : line.toCharArray()) {
                int newX = x, newY = y;
                switch (move) {
                    case 'U': newX = Math.max(0, x-1); break;
                    case 'D': newX = Math.min(2, x+1); break;
                    case 'L': newY = Math.max(0, y-1); break;
                    case 'R': newY = Math.min(2, y+1); break;
                }
                x = newX; y = newY;
            }
            code.append(keypad[x][y]);
        }

        System.out.println(code);
    }
}

