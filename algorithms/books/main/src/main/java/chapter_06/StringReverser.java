package chapter_06;

import java.util.Stack;

public class StringReverser {
	public static void main(String[] args) {
		String one = "Eric Jankowski";
		String two = "This is a longer sentence";
		String three = "racecar";
		
		System.out.println(one + " --- " + reverse(one));
		System.out.println(two + " --- " + reverse(two));
		System.out.println(three + " --- " + reverse(three));
	}
	
	public static String reverse(String original){
		Stack<Character> stack = new Stack<Character>();
		for (Character c : original.toCharArray()){
			stack.push(c);
		}
		
		String result = "";
		
		while(!stack.isEmpty()){
			result += stack.pop();;
		}
		
		return result;
	}
}
