package LearnJava;

public class LearnIf {
	public static void main(String[] args) {
		// if marks < 35 = fail
		// marks >= 35 -> pass
		int marks = 67;
		if (marks == 35) {
			System.out.println("fail and got F grade");
		} else if (marks >= 45 && marks <= 65) {
			System.out.println("E");
		} else if (marks <= 75 && marks >= 66) {
			System.out.println("D");
		} else if (marks <= 85 && marks >= 76) {
			System.out.println("C");
		} else {
			System.out.println("A");
		}
	}
}