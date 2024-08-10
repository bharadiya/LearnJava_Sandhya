package WhileLoop;

public class PrintAdditionOfDigits {
	public static void main(String[] args) {
		// 245 = 11
		// 356987 = 38
		int n = 2345; // 2345 % 10 = 5 // 2345/10 = 234
		int sum = 0;
		while (n > 0) {
			int remainder = n % 10; // 5
			int quotient = n / 10;
			n = quotient;
			sum += remainder;
		}
		System.out.println(sum);
	}
}
