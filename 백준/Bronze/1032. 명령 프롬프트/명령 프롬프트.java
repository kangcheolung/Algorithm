

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] files = new String[n];

        for (int i = 0; i < n; i++) {
            files[i] = br.readLine();
        }

        int length = files[0].length();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<length; i++){
            char ch = files[0].charAt(i);
            boolean same = true;

            for(int j=1; j<n; j++){
                if(files[j].charAt(i) != ch){
                    same = false;
                    break;
                }
            }
            if(same){
                result.append(ch);
            } else {
                result.append("?");
            }
        }
        System.out.println(result.toString());
    }
}
