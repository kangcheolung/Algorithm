import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long s = Long.parseLong(br.readLine());

		long sum = 0;
		long count = 0;

		while(true){
			count++;
			sum += count;

			if(sum > s){
				break;
			}
		}
		System.out.println(count-1);
	}
}