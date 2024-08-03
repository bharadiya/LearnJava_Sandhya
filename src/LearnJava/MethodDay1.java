package LearnJava;

public class MethodDay1 {
	public static void main(String[] args) {
		doAddition(4, 6);
	}

	static void doAddition(int a, int b) {
		System.out.println(a + b);
	}

	static int doAddition(int a, int b, int c) {
		int sum = a + b;
		return sum;
	}

	static float doAddition(int a, int b, int c, float f) {
		float sum = a + b + c + f;
		return sum;
	}
}
//methods are the ones which you can reuse
// methods are nothing but kind of machines in java which gets your work done fastly

//<access modifier> <static or non static> <return type> <name of the method> (optional Arguments){
//	
//}
