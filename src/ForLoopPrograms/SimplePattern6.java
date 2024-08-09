package ForLoopPrograms;

public class SimplePattern6 {
	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
//		printStarPattern();
		printStarPatternWithParameter(9);
	}

	public static void printStarPattern() {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void printStarPatternWithParameter(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//<access modifier> <static or non static> <method return type> <name of the method>(){
//
//}