import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] students = new boolean[31];

        for(int i = 0; i < 28; i++){
            int number = Integer.parseInt(br.readLine());
            students[number] = true;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<students.length; i++){
            if(!students[i]){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
