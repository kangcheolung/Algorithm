import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Map<String,Integer > bookCount = new HashMap<>();

		for(int i=0; i<N; i++){
			String book = br.readLine();
			bookCount.put(book, bookCount.getOrDefault(book,0) + 1);
		}

		int maxCount = 0;
		for(int count: bookCount.values()){
			maxCount = Math.max(maxCount, count);
		}

		String answer = "";
		for (String book : bookCount.keySet()) {
			if (bookCount.get(book) == maxCount) {
				if (answer.isEmpty() || book.compareTo(answer) < 0) {
					answer = book;
				}
			}
		}
		
		System.out.println(answer);


	}
}
