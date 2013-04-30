public class Divisors {
	public static void main (String [] args){
		int winner = 1;
		int numDivisors = 0;
		int candidateNumDivisors = 0;
		for(int i=1;i<10001;i++){
			candidateNumDivisors = 0;
			for(int j=i;j>0;j--){
				if(i%j==0){
					candidateNumDivisors++;
				}
			}
			if (candidateNumDivisors > numDivisors){
				winner = i;
				numDivisors = candidateNumDivisors;
			}
		}
		System.out.println("\n\nWinner: " + winner + " with " + numDivisors + " divisors.");
	}
}