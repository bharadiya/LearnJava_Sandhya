package LearnJava;

public class PrintOddNumbers {
	public static void main(String[] args) {
		for (int i = 1; i <= 11; i++) {
			if (i % 2 == 1) {
				continue; // for skipping something in your loop
			}
			System.out.println(i);
		}
	}
}
