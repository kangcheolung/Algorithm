import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int []arr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}


		int minSum = Integer.MAX_VALUE;
		int answer = 0;

		Arrays.sort(arr);
		
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += Math.abs(arr[i] - arr[j]);
			}

			if(minSum > sum ){
				minSum = sum;
				answer = arr[i];
			}

		}
		System.out.println(answer);

	}
}
