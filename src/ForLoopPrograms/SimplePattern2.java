package ForLoopPrograms;

public class SimplePattern2 {
	public static void main(String[] args) {
		 int numberOfLines = 100;
		for (int line = 1; line <= numberOfLines; line++) {
			for (int printStars = 1; printStars <= line; printStars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//*    		1 - 1
//**   		2 - 2
//***  		3 - 3
//****
//*****