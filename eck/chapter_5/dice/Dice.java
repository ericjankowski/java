public class Dice{
	private int die1 = 1;
	private int die2 = 1;
	
	public int roll(){
		return (int)(Math.random()*6 +1) + (int)(Math.random()*6 +1);
	}
}