public class Test {
	public static void main (String [] args){
		Dice d = new Dice();
		int total = 0;
		int count = 0;
		while(total != 2){
			total = d.roll();
			count++;
		}
		System.out.println("It took " + count + " roll(s) to roll Snake Eyes!");
	}
}