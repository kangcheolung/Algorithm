

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for(int i=0; i<9; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        int max = arr[0];
        int maxIndex = 0;

        for(int i=1; i<9; i++){
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex + 1);

        br.close();
    }
}
