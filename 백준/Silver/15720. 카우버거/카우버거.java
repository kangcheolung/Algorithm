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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			list1.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < b; i++) {
			list2.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < c; i++) {
			list3.add(Integer.parseInt(st.nextToken()));
		}

		int totalBefore = 0;
		for (int price : list1) totalBefore += price;
		for (int price : list2) totalBefore += price;
		for (int price : list3) totalBefore += price;

		Collections.sort(list1, Collections.reverseOrder());
		Collections.sort(list2, Collections.reverseOrder());
		Collections.sort(list3, Collections.reverseOrder());

		int totalAfter = 0;
		int minSize = Math.min(Math.min(a, b), c);

		for(int i=0; i<minSize; i++){
			totalAfter += (int)(list1.get(i)+ list2.get(i)+ list3.get(i)) * 0.9;
		}

		for (int i =minSize; i<a; i++){
			totalAfter += list1.get(i);
		}

		for (int i =minSize; i<b; i++){
			totalAfter += list2.get(i);
		}

		for (int i =minSize; i<c; i++){
			totalAfter += list3.get(i);
		}


		System.out.println(totalBefore);
		System.out.println(totalAfter);

	}
}
