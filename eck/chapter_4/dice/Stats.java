public class Stats {
	public static void main (String [] args){
		System.out.println("\nTotal On Dice    Average Number of Rolls");
		System.out.println("-------------    -----------------------");
		
		for(int i = 2; i<13; i++){
			int rollCount = 0;
			for(int j = 0;j<100000;j++){
				rollCount += Dice.countRollsNeedeToRoll(i);
			}
			System.out.println("      " + i + "              " + rollCount/100000.0);
		}
	}
}