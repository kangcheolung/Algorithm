import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int n = word.length();

		String answer = null;

		for (int i = 1; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				String a = word.substring(0,i);
				String b = word.substring(i,j);
				String c = word.substring(j);

				String revered = new StringBuilder(a).reverse().toString()
					+ new StringBuilder(b).reverse().toString()
					+ new StringBuilder(c).reverse().toString();

				if (answer == null || revered.compareTo(answer) < 0) {
					answer = revered;
				}
			}
		}
		System.out.println(answer);
	}
}
