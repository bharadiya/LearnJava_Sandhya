package LearnJava;

public class CheckNumberIsEven {
	public static void main(String[] args) {
//		int number = 10;
//		int remainder = number % 2;
//		boolean isOdd = remainder == 1;
//		if (isOdd) {
//			System.out.println("odd");
//		} else {
//			System.out.println("even");
//		}
		
		System.out.println(isEven(7));
	}

	public static boolean isEven(int a) {
		return a % 2 == 0;
	}
}
