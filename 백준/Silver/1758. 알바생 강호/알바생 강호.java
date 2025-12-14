import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Integer [] tips = new Integer[n];

		long result = 0;
		for(int i=0; i<n; i++){
			int tip = Integer.parseInt(br.readLine());
			tips[i] = tip;
		}

		Arrays.sort(tips, Collections.reverseOrder());

		for(int i=0; i<n; i++){
			long calculatedTip = tips[i] - i;
			if(calculatedTip > 0){
				result += calculatedTip;
			}
		}

		System.out.println(result);
	}
}
