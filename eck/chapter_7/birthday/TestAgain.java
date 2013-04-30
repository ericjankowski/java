public class TestAgain{
	public static void main (String [] args){
		int [] selected = new int [365];
		int count = 0;
		for(int i=0;i<365;i++){
			selected[i]=0;
		}
		for(int i=0;i<365;i++){
			selected[(int)(Math.random()*365)]++;
		}
		for(int i=0;i<365;i++){
			if(selected[i] != 0){
				count++;
			}
		}
		System.out.println("We found " + count +" distinct birthdays after selecting 365 random people.");
	}
}