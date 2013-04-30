public class Dice {
	
	public static void main (String [] args){
		System.out.println("It took " + countRollsNeedeToRoll(2) + " roll(s) to reach Snake Eyes!");
	}
	
	
	public static int countRollsNeedeToRoll(int goal){
		if (goal < 2 || goal > 12){
			throw new IllegalArgumentException("Goal " + goal + " not possible with one roll of two dice.");
		}else{
			int rollCount = 0;
			int total = 0;
			while(total != goal){
				total = (int)(Math.random()*6 + 1) + (int)(Math.random()*6 + 1);
				rollCount ++;
			}
			return rollCount;
		}
		
	}
}