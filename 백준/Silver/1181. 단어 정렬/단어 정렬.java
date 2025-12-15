import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] words = new String[n];

		for(int i=0; i<n; i++){
			words[i] = br.readLine();
		}

		words = Arrays.stream(words).distinct().toArray(String[]::new);

		Arrays.sort(words, (s1, s2) -> {
			if(s1.length() != s2.length()){
				return s1.length() - s2.length();
			}
			return s1.compareTo(s2);
		});
		
		for(String word: words){
			System.out.println(word);
		}
	}
}
