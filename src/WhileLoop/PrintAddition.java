package WhileLoop;

public class PrintAddition {
	public static void main(String[] args) {
		int n = 10;
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum = sum + i; // sum += i
			i++;
		}
		System.out.println(sum);
	}
}
