import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine()); // 다친 손가락
		long m = Long.parseLong(br.readLine()); // 몇번 셀수 있는지

		int [] cycle = {1, 2, 3, 4, 5, 4, 3, 2};

		int perCycle = 0;
		for(int f:cycle){
			if(f == n) perCycle++;
		}

		long cycles = m / perCycle;
		long remain = m % perCycle;

		long answer = cycles * 8;

		for(int i=0; i<8; i++){
			if(cycle[i] == n){
				remain--;
			}
			if(remain < 0) break;
			answer ++;
		}

		System.out.println(answer);


	}
}
