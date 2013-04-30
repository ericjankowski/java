public class Dice{
	private int die1 = 1;
	private int die2 = 1;
	
	public int roll(){
		return (int)(Math.random()*6 +1) + (int)(Math.random()*6 +1);
	}
	
	public int countRollsNeededToRoll(int goal){
		if (goal < 2 || goal > 12){
			throw new IllegalArgumentException("Goal " + goal + " not possible with one roll of two dice.");
		}else{
			int rollCount = 0;
			int total = 0;
			while(total != goal){
				total = this.roll();
				rollCount ++;
			}
			return rollCount;
		}
	}
}