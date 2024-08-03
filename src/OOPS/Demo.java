package OOPS;

class Student {
	String name;
	int rollNum;
	static String schoolName = "NPS";

	Student() {
		System.out.println("Learning constructor");
	}

	Student(String name, int rollNum) {
		this.name = name;
		this.rollNum = rollNum;
	}

	Student(int rollNum) {
		this.rollNum = rollNum;
	}

	Student(String name) {
		this.name = name;
	}

	public void getStudentDetails() {
		System.out.println("Student name is " + this.name);
		System.out.println("Roll number is " + this.rollNum);
		System.out.println("School name is " + schoolName);
	}
}

public class Demo {
	public static void main(String[] args) {
		Student sandhya = new Student();
//		Student sb = new Student();
//		sb.name = "shashank";
//		sb.rollNum = 2;
		sandhya.name = "sandhya";
		sandhya.rollNum = 1;
		sandhya.getStudentDetails();
//		sb.getStudentDetails();

		Student manoj = new Student("Manoj", 3);
		manoj.getStudentDetails();
	}
}
