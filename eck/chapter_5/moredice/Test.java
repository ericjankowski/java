public class Test{
	public static void main (String [] args){
		Dice d = new Dice();
		System.out.println("\nTotal On Dice    Average Number of Rolls    Standard Deviation    Maximum Number");
		System.out.println("-------------    -----------------------    ------------------    --------------");
		
		for(int i = 2; i<13; i++){
			StatCalc s = new StatCalc();
			for(int j = 0;j<10000000;j++){
				s.enter(d.countRollsNeededToRoll(i));
			}
			System.out.println("      " + i + "              " + s.getMean() + "              " + s.getStandardDeviation() + "    " + s.getMax());
		}
	}
}