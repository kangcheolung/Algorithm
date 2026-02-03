import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<Integer> listA = new ArrayList<>();
		List<Integer> listB = new ArrayList<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++){
			listA.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++){
			listB.add(Integer.parseInt(st.nextToken()));
		}


		Collections.sort(listA,Collections.reverseOrder());
		Collections.sort(listB);

		int S = 0;
		for (int i=0; i<N; i++){
			S += listA.get(i) * listB.get(i);
		}

		System.out.println(S);
	}
}
