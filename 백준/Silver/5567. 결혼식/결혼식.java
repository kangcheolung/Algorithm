import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		boolean[][] friend = new boolean[n + 1][n + 1];

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			friend[a][b] = true;
			friend[b][a] = true;
		}

		Set<Integer> visited = new HashSet<>();
		for (int i = 2; i <= n; i++) {
			if (friend[1][i]) {
				visited.add(i);
			}
		}

		Set<Integer> secondDegree = new HashSet<>();
		for (int f : visited) {
			for (int i = 2; i <= n; i++) {
				if (friend[f][i] && i != 1) {
					secondDegree.add(i);
				}
			}
		}

		visited.addAll(secondDegree);

		System.out.println(visited.size());
	}
}