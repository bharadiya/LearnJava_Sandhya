package PatternPrograms;

public class SimplePattern {
	public static void main(String[] args) {
		int numberOfLines = 3;
		for (int line = 1; line <= numberOfLines; line++) {
			for (int printStars = 1; printStars <= numberOfLines; printStars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//*****
//*****
//*****
//*****
//*****