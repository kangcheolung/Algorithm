import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String poll = br.readLine();

		StringBuilder sb = new StringBuilder(poll);
		int i = 0;

		while (i < sb.length()){
			if(sb.charAt(i) == 'X'){
				int start = i;
				while(i < sb.length() && sb.charAt(i) == 'X') i++;
				int len = i - start;

				if(len % 2 != 0){
					System.out.println(-1);
					return;
				}

				int j = start;
				while (len >= 4){
					sb.replace(j, j+4, "AAAA");
					j += 4;
					len -= 4;
				}

				if (len ==2){
					sb.replace(j, j+2, "BB");
				}
			}else{
				i++;
			}
		}

		System.out.println(sb.toString());
	}
}
