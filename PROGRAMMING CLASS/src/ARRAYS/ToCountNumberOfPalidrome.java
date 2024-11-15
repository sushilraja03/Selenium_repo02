package ARRAYS;

public class ToCountNumberOfPalidrome {

	public static void main(String[] args) {

		int x[] = { 56, 99, 34, 454, 22, 123, 151 };

		int count = 0;
		for (int i = 0; i <= x.length - 1; i++) {
			boolean res = isPall(x[i]);

			if (res == true)
				count++;
		}
		System.out.println(count);

	}

	static boolean isPall(int n) {

		int temp = n;
		int rev = 0;
		for (int i = 1; i <= 500; i++) {
			while (n > 0) {
				int rem = n % 10;
				rev = rev * 10 + rem;
				n = n / 10;
			}

		}
		if (rev == temp)
			return true;
		else
			return false;

	}
}
