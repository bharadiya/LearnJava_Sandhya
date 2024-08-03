package LearnJava;

import java.util.Scanner;

public class AdditonofDigits {
	public static void main(String[] args) {
		long num = 65465842; // 5+2+3 = 10 123456789 = 45
		long sum = 0;
		while (num > 0) {
			// process of seperation
			long remainder = num % 10;
			num = num / 10;
			// sum = sum + remainder;
			sum += remainder;
			// System.out.println(remainder);
		}
		System.out.println(sum);

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter username");

		String name = myObj.nextLine();
		System.out.println("Entered username is " + name);
	}
}
