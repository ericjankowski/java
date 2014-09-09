package chapter_06;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class ExpressionEvaluator {
	public static final Pattern UNSIGNED_DOUBLE = Pattern.compile("((\\d+\\.?\\d*)|(\\.\\d+))([Ee][-+]?\\d+)?.*?");
	public static final Pattern CHARACTER = Pattern.compile("\\S.*?");

	public static void main (String [] args){
		String one = "(2 + 3)";
		String two = "((2 + 3) + 4)";
		String three = "(2 + (3 + 4))";
		
		System.out.println(one + " = " + evaluate(one));
		System.out.println(two + " = " + evaluate(two));
		System.out.println(three + " = " + evaluate(three));  //not sure why this doesn't work, yet.
	}
	
	public static double evaluate (String expression){
		Stack<Double> numbers = new Stack<Double>();
		Stack<Character> operations = new Stack<Character>();
		
		Scanner input = new Scanner(expression);
		String next;
		while (input.hasNext()){
			if (input.hasNext(UNSIGNED_DOUBLE)){
				next = input.findInLine(UNSIGNED_DOUBLE);
				numbers.push(new Double(next));
			} else {
				next = input.findInLine(CHARACTER);
				switch (next.charAt(0)) {
					case '+':
					case '-':
					case '*':
					case '/':
						operations.push(next.charAt(0));
						break;
					case ')':
						evaluateStackTops(numbers, operations);
						break;
					case '(':
						break;
					default:
						throw new IllegalArgumentException("Illegal Character");
				}
			}
		}
		if (numbers.size() != 1){
			throw new IllegalArgumentException("Illegal input expression");
		}
		input.close();
		return numbers.pop();
	}

	private static void evaluateStackTops(Stack<Double> numbers, Stack<Character> operations) {
		double operand1;
		double operand2;
		
		if ((numbers.size() > 2) || operations.isEmpty()){
			System.out.println(numbers.size());
			throw new IllegalArgumentException("Illegal inpput expression");
		}
		
		operand2 = numbers.pop();
		operand1 = numbers.pop();
		
		switch (operations.pop()) {
			case '+': 
				numbers.push(operand1 + operand2);
				break;
			case '-': 
				numbers.push(operand1 - operand2);
				break;
			case '*': 
				numbers.push(operand1 * operand2);
				break;
			case '/':
				numbers.push(operand1 / operand2);
				break;
			default:
				throw new IllegalArgumentException("Illegal operation");
		}
	}
}
