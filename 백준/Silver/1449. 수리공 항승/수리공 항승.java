import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int count = 1;
		int tapeEnd = arr[0] + L -1; // 첫 테이프의 끝 위치

		for (int i = 1; i < N; i++) {
			if(arr[i] > tapeEnd){
				count++;
				tapeEnd = arr[i] + L -1;
			}
		}

		System.out.println(count);
	}
}
