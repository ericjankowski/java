public class TestAgainAgain{
	public static void main (String [] args){
		int [] selected = new int [365];
		int count = 0;
		for(int i=0;i<365;i++){
			selected[i]=0;
		}
		for(int i=0;i<365;i++){
			while(selected[i]==0){
				selected[(int)(Math.random()*365)]++;
				count++;
			}
		}
		System.out.println("It took " + count + " selections to find at least one person born on each day of the year.");
		
	}
}