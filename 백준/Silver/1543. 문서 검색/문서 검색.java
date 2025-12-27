import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String T = br.readLine();
		
		int sizeS = S.length();
		int sizeT = T.length();
		
		S = S.replace(T, "");
		int newSize = S.length();
		int count = (sizeS - newSize) / sizeT;
		System.out.println(count);
	}
}