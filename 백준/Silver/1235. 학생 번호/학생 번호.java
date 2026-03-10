import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =  Integer.parseInt(br.readLine());
		String []arr = new String[N];

		for (int i=0; i<N; i++){
			arr[i] = br.readLine();
		}

		for(int k = 1; k <=arr[0].length(); k++){
			HashSet<String> set = new HashSet<>();

			for(int i=0; i<N; i++){
				String cut = arr[i].substring(arr[i].length() - k);
				set.add(cut);
			}

			if(set.size() == N){
				System.out.println(k);
				break;
			}
		}
	}
}
