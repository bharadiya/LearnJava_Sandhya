package LearnJava;

public class LogicalOperators {
	public static void main(String[] args) {
//		35minus - Failed 
//		35 - 44 - Grade E
//		36 - 45 - Grade D
//		46 - 55 - Grade C
		// rest all are passed
		int marks = 34;
		if (marks >= 46 && marks <= 55) {
			System.out.println("C");
		} else if (marks >= 36 && marks <= 45) {
			System.out.println("D");
		} else if (marks >= 35 && marks <= 44) {
			System.out.println("E");
		} else if (marks <= 34) {
			System.out.println("F");
		} else {
			System.out.println("passed");
		}
	}
}
//Combining multiple conditions is done with && and ||
// you can combine infinite number 
