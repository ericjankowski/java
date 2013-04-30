public class Dice {
	public static void main (String [] args){
		int rollCount = 0;
		int die1 = 0;
		int die2 = 0;
		boolean snakeEyes = false;
		while(!snakeEyes){
			rollCount++;
			die1 = (int)(Math.random() * 6) + 1;
			die2 = (int)(Math.random() * 6) + 1;
			if (die1 == 1 && die2 == 1){
				snakeEyes = true;
			}
			System.out.println("Die 1: "+ die1 + " Die 2: " + die2);
		}
		System.out.println("It took "+ rollCount +" rolls to get snake eyes.");
	}
	
}