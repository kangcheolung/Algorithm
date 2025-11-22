

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] heights = new int[9];
        int totalHeight = 0;

        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            totalHeight += heights[i];
        }

        int heightToRemove = totalHeight - 100;
        boolean found = false;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (heights[i] + heights[j] == heightToRemove) {
                    heights[i] = -1;
                    heights[j] = -1;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        Arrays.sort(heights);

        for (int height : heights) {
            if (height != -1) {
                System.out.println(height);
            }
        }
    }
}