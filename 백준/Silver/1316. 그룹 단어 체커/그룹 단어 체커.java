import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int count = 0;
		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			if(isGroupWord(word)){
				count++;
			}
		}
		System.out.println(count);
	}


	private static boolean isGroupWord(String word){
		Set<Character> seen = new HashSet<>();
		char prev = '\0'; // 빈 문자

		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);

			// 이전 문자와 다른데 이미 나온 적 있으면
			if(c != prev && seen.contains(c)){
				return false;
			}
			seen.add(c);
			prev = c;
		}
		return true;
	}
}
