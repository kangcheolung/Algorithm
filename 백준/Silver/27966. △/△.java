import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());

		//(N-1)(N-2)/2 *2 +(N-1) =.(N-1)(N-2) + (N-1) == n^2 -3n +2 +n -1 = n^2 -2n +1 = (n-1)^2
		long total = (N-1)*(N-1);
		System.out.println(total);

		for (int i = 2; i <= N; i++) {
			System.out.println("1 " + i);
		}
	}
}
