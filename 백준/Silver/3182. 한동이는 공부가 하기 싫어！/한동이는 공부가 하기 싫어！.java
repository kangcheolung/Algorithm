import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =  Integer.parseInt(br.readLine());
		int[] next = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			next[i] = Integer.parseInt(br.readLine());
		}

		int maxCount = 0;
		int answer = 1;

		for(int start = 1; start <= n; start++){
			boolean[] visited = new boolean[n+1];
			int cur = start;
			int count = 0;

			while(!visited[cur]){
				visited[cur] = true;
				count++;
				cur = next[cur];
			}

			if(count > maxCount){
				maxCount = count;
				answer = start;
			}
		}
		
		System.out.println(answer);


	}
}
