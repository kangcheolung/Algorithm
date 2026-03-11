import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();

		int diff = B.length()  - A.length();
		int min = A.length();

		for(int i=0; i<=diff; i++){
			int count = 0;
			for(int j=0; j<A.length(); j++){
				if(A.charAt(j) != B.charAt(i+j)){
					count++;
				}
			}
			min = Math.min(min, count);
		}
		
		System.out.println(min);
	}
}
