package chapter_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeExample {
	public static void main (String [] args){
		Scanner stdin = new Scanner(System.in);
		
		String line;
		
		do {
			System.out.print("Your expression (or return to end): ");
			
			line = stdin.nextLine();
			
			if (isPalindrome(line)){
				System.out.println("That is a palindrome.");
			}else{
				System.out.println("That is not a palindrome.");
			}
		} while (line.length() != 0);
		
		stdin.close();
	}

	private static boolean isPalindrome(String input) {
		Queue<Character> queue = new LinkedList<Character>();
		Stack<Character> stack = new Stack<Character>();
		
		Character letter;
		boolean isPalindrome = true;
		for (int i = 0; i< input.length(); i++){
			letter = input.charAt(i);
			if (Character.isLetter(letter)){
				queue.add(letter);
				stack.push(letter);
			}
		}
		
		while (!queue.isEmpty()){
			if (queue.remove() != stack.pop()){
				isPalindrome = false;
			}
		}
		return isPalindrome;
	}
}
