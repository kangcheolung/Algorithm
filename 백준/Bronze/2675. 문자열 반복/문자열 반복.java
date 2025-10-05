import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); 

        for (int i = 0; i < T; i++) {
            String line = br.readLine(); 
            StringTokenizer st = new StringTokenizer(line);  
            int R = Integer.parseInt(st.nextToken());  
            String S = st.nextToken(); 

            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                for (int k = 0; k < R; k++) {
                    sb.append(c);
                }
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}