package PatternPrograms;

public class SimplePattern4 {
	public static void main(String[] args) {
		int n = 7;
		for (int line = 1; line <= n; line++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(i);
				if(line == i)
				{
					break;
				}
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