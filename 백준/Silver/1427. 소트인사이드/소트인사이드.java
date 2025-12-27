import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		Character [] chars = new Character[input.length()];
		for (int i=0; i<input.length(); i++){
			chars[i] = input.charAt(i);
		}

		Arrays.sort(chars,Collections.reverseOrder());

		for (char c: chars){
			System.out.print(c);
		}
	}
}
