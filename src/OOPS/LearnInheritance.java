package OOPS;

class Shape {
	int f=2;
	private void area() {
		System.out.println("Displays Area of Shape");
	}
}

class Triangle extends Shape {
	int h;
	int b;

	public Triangle(int h, int b) {
		this.h = h;
		this.b = b;
	}

	void area() {
		double d = 0.5 * h * b;
		System.out.println(d);
	}
}

public class LearnInheritance {
	public static void main(String[] args) {
		Triangle s = new Triangle(5, 6);
		s.area();
	}
}
