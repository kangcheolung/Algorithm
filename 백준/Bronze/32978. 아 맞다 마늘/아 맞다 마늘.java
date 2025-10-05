

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++ ){
            set.add(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++){
            set.remove(st2.nextToken());
        }

        for(String s: set){
            System.out.println(s);
        }
    }
}
