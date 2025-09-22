

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st2.nextToken());
        int D = Integer.parseInt(st2.nextToken());

        if(A+C < B+D){
            System.out.println("Hanyang Univ.");
        }else if(A+C > B+D){
            System.out.println("Yongdap");
        }else{
            System.out.println("Either");
        }
    }
}
