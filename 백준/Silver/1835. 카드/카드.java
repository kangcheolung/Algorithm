import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Deque<Integer> dq = new ArrayDeque<>(N);

		for(int k = N; k >= 1; k--){
			dq.addFirst(k);
			for(int i=0; i<k; i++){
				dq.addFirst(dq.pollLast());
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int card : dq){
			sb.append(card).append(" ");
		}

		System.out.println(sb);



	}
}
