import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> colors = Arrays.asList(
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
        );

        int a = colors.indexOf(br.readLine());
        int b = colors.indexOf(br.readLine());
        int c = colors.indexOf(br.readLine());

        long result = a * 10 + b;
        for (int i = 0; i < c; i++) {
            result *= 10;
        }

        System.out.println(result);
    }
}