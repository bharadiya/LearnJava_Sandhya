package Array;

public class Day1 {
	public static void main(String[] args) {
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 6;
//		int e = 7;

		int[] n = { 1, 2, 3, 6, 7 }; // 1+2+3+6+7 = 19
		// System.out.println(n[4]);
		// System.out.println(n.length);

		int sum = 0;
		for (int i = 0; i < n.length - 1; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}

// Array is non primitive data type in Java
// Store group of number together or store group of data type together
// once initialized can't change it 
// can you add different data type - no
