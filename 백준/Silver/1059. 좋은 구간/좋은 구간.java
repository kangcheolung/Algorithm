

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] S = new int[L];
		for (int i=0; i<L; i++){
			S[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(S);

		int n = Integer.parseInt(br.readLine());

		for(int s:S){
			if(s==n){
				System.out.println(0);
				return;
			}
		}

		int left = 0;
		for(int s:S){
			if(s<n) left = s;
		}

		int right = 0;
		for(int s:S){
			if(s>n){
				right = s;
				break;
			}
		}

		int count = (n-left)*(right-n) -1;
		System.out.println(count);

	}
}
