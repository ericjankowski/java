public class Test{
	public static void main (String [] args){
		int [] selected = new int[365];
		int pickCount = 0;
		for (int i = 0;i<selected.length;i++){
			selected[i] = 0;
		}
		boolean foundThree = false;
		while(!foundThree){
			int pick = (int)(Math.random()*365);
			selected[pick]++;
			pickCount++;
			foundThree = selected[pick]==3;
		}
		System.out.println("It took " + pickCount + " selections before finding 3 people with the same birthday.");
	}
}