package PatternPrograms;

public class SimplePattern3 {
	public static void main(String[] args) {
		int n = 7;
//		for (int line = 1; line <= n; line++) {
//			for (int stars = (n - line + 1); stars >= 1; stars--) {
//				System.out.print("*");
//			}
//			System.out.println();
		alternateWay(n);
//		}
	}

	public static void alternateWay(int n) {
		for (int line = 1; line <= n; line++) {
			for (int stars = 1; stars <= (n - line + 1); stars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//***   1 - 5
//**    2 - 4
//*		3 - 3
// 		4 - 2
//		5 - 1