import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] dp = new int[15][15];


        for (int i=1; i<15; i++) {
            dp[0][i] = i;
        }

        for (int k = 1; k <= 14; k++) {        // 층
            for (int n = 1; n <= 14; n++) {    // 호
                dp[k][n] = dp[k][n-1] + dp[k-1][n];
            }
        }


        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[k][n]).append('\n');
        }
        System.out.print(sb);
    }
}
