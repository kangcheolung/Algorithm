import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		long count = 0;
		int digits = 1;  // 현재 자릿수
		int start = 1;   // 구간 시작점

		while (start <= n) {
			int end = (int) Math.min((long) start * 10 - 1, n);
			count += (long) (end - start + 1) * digits;
			digits++;
			start *= 10;
		}

		System.out.println(count);
	}
}