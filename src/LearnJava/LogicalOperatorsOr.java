package LearnJava;

public class LogicalOperatorsOr {
	public static void main(String[] args) {
		boolean condition1 = true;
		boolean condition2 = false;
		boolean condition3 = false;
		boolean condition4 = false;
		boolean condition5 = false;
		boolean comboAnd = condition1 && condition2 && condition3 && condition4 && condition5;
		boolean comboOr = condition1 || condition2 || condition3 || condition4 || condition5;

		System.out.println(comboAnd);
		System.out.println(comboOr);
	}
}
//Combining multiple conditions is done with && and ||
// you can combine infinite number 
