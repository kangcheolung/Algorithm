import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());

		int d = 1;
		while(X>d){
			X -= d;
			d++;
		}


		int num, den;
		if (d % 2 == 0) {
			num = X;
			den = d - X + 1;
		} else {
			num = d - X + 1;
			den = X;
		}

		System.out.println(num + "/" + den);

	}
}
