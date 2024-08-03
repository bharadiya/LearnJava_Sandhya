package LearnJava;

public class LearnForLoop {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				break; // for breaking a for loop
			} else if (i == 2) {
				continue; // for skipping something in your loop
			}
			System.out.println("8 * " + i + " = " + i * 8);
		}
	}
}
