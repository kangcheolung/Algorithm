import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int sum = 0;
        int position = 0; 
        int num = 1;       

        while (position < B) {
            for (int i = 0; i < num; i++) {
                position++;
                
                if (position >= A && position <= B) {
                    sum += num;
                }
                
                if (position >= B) break;
            }
            num++;
        }

        System.out.println(sum);
    }
}