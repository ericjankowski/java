package recursion.binary_search.challenges;

public class FindTheSquareRoot {
	public static void main(String[] args) {
		int square = 25;
		System.out.println("The square root of "+ square +" is " + getSquareRoot(square, 1, square));
	}

	private static int getSquareRoot(int square, int minimum, int maximum) {
		int guess = (minimum + maximum)/2;
		int guessSquared = guess * guess;
		if(guessSquared == square){
			return guess;
		}else if(guessSquared > square){
			return getSquareRoot(square, minimum, guess-1);
		}else if(guessSquared < square){
			return getSquareRoot(square, guess+1, maximum);
		}else{
			return -1;
		}
	}
}
