

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String s = "CAMBRIDGE";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line  = br.readLine();

        if (line != null) {
            for ( int i = 0; i < s.length(); i++ ) {
                line = line.replace(String.valueOf(s.charAt(i)), "");
            }
            System.out.println(line);
        }
    }
}
