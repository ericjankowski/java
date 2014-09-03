package chapter_03.self_test_exercises;

public class ArrayMonkey {
	public static void main(String[] args) {
		int value = 1;
		int [] b = new int[1000];
		
		for(int i =  0; i < b.length; i++){
			b[i] = value++;
		}
		
		System.out.println(b[0] + ", " + b[49] + ", " + b[999]);
		
		System.out.println("\n\n-------------------\n\n");
		
		int[] p = new int[100];
		int[] s = p;
		
		p[99] = 75;
		
		System.out.println(s[99]); // Pass array objects by refrence, sucka.
		
		System.out.println("\n\n-------------------\n\n");

		
	}
}
