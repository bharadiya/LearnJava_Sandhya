package IfCondition;

public class IfCondition2 {
	public static void main(String[] args) {
		// 35 and 45 = D
		// 35 - = Fail & F
		int marks = 102;
		if (marks < 35) {
			System.out.println("F");
		} else if (marks >= 35 && marks <= 45) {
			System.out.println("D");
		} else if (marks >= 46 && marks <= 55) {
			System.out.println("C");
		} else if (marks >= 56 && marks <= 65) {
			System.out.println("B");
		} else if (marks >= 66 && marks <= 75) {
			System.out.println("A");
		} else if (marks >= 76 && marks <= 90) {
			System.out.println("A+");
		} else {
			if (marks > 100) {
				System.err.println("Please enter marks in the range of 0 -100 only . Thanks !");
			}
			else if(marks <= 100)
			{
				System.out.println("Excellent");
			}
		}
	}
}

//type casting