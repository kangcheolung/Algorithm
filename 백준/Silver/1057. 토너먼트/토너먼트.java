import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken()); // 김지민
		int I = Integer.parseInt(st.nextToken()); // 임한수

		int round = 0;

		while (K != I){
			K = (K + 1) / 2;
			I = (I + 1) / 2;
			round++;
		}

		System.out.println(round);

	}
}
