package chapter_06;

import java.util.EmptyStackException;

public class ArrayStackClient {
	public static void main(String[] args) {
		ArrayStack<Character> stack = new ArrayStack<Character>();

		String name = "puppers";

		for (Character c : name.toCharArray()) {
			stack.push(c);
		}

		String reversedName = "";
		while (!stack.isEmpty()) {
			reversedName += stack.pop();
		}
		
		System.out.println(name + " -- " + reversedName);
	}
}