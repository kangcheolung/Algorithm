

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            String str = String.valueOf(n);
            String reverse = new StringBuilder(str).reverse().toString();

            if(str.equals(reverse)){
                sb.append("yes\n");
            }else {
                sb.append("no\n");
            }
        }
        System.out.println(sb);







    }
}
