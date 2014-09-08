package chapter_06;

import java.util.Stack;

public class ParenthesisExample {
	public static void main(String [] args){
		String one = "(){}[]({[]})";
		String two = "()(";
		String three = "())";
		String four = "(){}[]({[]})){}[]({[]})";
		System.out.println(isBalanced(one) + "\t-- " + one);
		System.out.println(isBalanced(two) + "\t-- " + two);
		System.out.println(isBalanced(three) + "\t-- " + three);
		System.out.println(isBalanced(four) + "\t-- " + four);
	}
	
	public static boolean isBalanced(String expression){
		final char LEFT_NORMAL = '(';
		final char RIGHT_NORMAL = ')';
		final char LEFT_CURLY = '{';
		final char RIGHT_CURLY = '}';
		final char LEFT_SQUARE = '[';
		final char RIGHT_SQUARE = ']';
		
		Stack<Character> store = new Stack<Character>();
		
		boolean failed = false;
		
		for (int i = 0; !failed && (i < expression.length()); i++){
			switch (expression.charAt(i)){
				case LEFT_NORMAL:
				case LEFT_CURLY:
				case LEFT_SQUARE:
					store.push(expression.charAt(i));
					break;
				case RIGHT_NORMAL:
					failed = store.isEmpty() || store.pop() != LEFT_NORMAL;
					break;
				case RIGHT_CURLY:
					failed = store.isEmpty() || store.pop() != LEFT_CURLY;
					break;
				case RIGHT_SQUARE:
					failed = store.isEmpty() || store.pop() != LEFT_SQUARE;
					break;
			}
		}
		
		return (store.isEmpty() && !failed);
	}
}
