import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		if(N == 0){
			System.out.println(0);
			return;
		}

		int [] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}


		int count = 1;
		int sum = 0;

		for(int i=0; i<N; i++){
			sum += arr[i];
			if (sum > M){
				count++;
				sum = arr[i];
			}
		}

		System.out.println(count);
	}
}
