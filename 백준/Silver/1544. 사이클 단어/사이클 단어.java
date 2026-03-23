

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		List<String> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			boolean isDuplicate = false;

			for (String saved : list){
				if(saved.length() == word.length() && (saved + saved).contains(word)){
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate){
				list.add(word);
			}
		}
		
		System.out.println(list.size());
	}
}
