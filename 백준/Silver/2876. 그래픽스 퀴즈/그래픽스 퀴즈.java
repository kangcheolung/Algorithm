import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int [] A = new int [N+1];
		int [] B = new int [N+1];

		for (int i=1; i<=N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			A[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
		}

		int count = 0;
		int grade = 1;

		for(int g=1; g<=5; g++){
			int con = 0;
			int maxLen = 0;

			for(int i=1; i<=N; i++){
				if(A[i] == g || B[i] == g){
					con++;
					maxLen = Math.max(maxLen, con);
				} else{
					con = 0;
				}
			}

			if(maxLen > count){
				count = maxLen;
				grade = g;
			}
		}

		System.out.println(count + " " + grade);



	}
}
