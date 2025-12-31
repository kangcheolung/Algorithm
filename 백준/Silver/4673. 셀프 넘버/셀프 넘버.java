public class Main {
	public static void main(String[] args) {
		boolean[] hasGenerator = new boolean[10001];

		for (int i = 1; i <= 10000; i++) {
			int dn = d(i);
			if (dn <= 10000) {
				hasGenerator[dn] = true;
			}
		}

		for (int i = 1; i <= 10000; i++) {
			if (!hasGenerator[i]) {
				System.out.println(i);
			}
		}
	}

	static int d(int n) {
		int sum = n;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
