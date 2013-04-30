import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EggsCounters {
	public static void main (String [] args){
		int eggs = 0;
		int dozen = 0;
		int remainder = 0;
						
		System.out.println("How many eggs do you have?");
						
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
						
		try{
			eggs = Integer.parseInt(in.readLine());
			dozen = eggs/12;
			remainder = eggs%2;

			System.out.println("You have " + dozen + " dozen eggs with " + remainder + " left over.");
		
		}catch(Exception e){
			System.out.println("\n\nCaught an exception: \n\n" + e.getMessage() );
		}
	}
}