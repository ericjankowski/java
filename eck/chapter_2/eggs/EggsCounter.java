import java.io.*;

public class EggsCounter{
	public static void main (String [] args){
		System.out.println("How many eggs do you have?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int eggs = 0;
		try{
			eggs = Integer.parseInt(br.readLine());
		}catch(Exception e){}
		int gross = eggs/144;
		int dozen = (eggs%144)/12;
		int leftover = (eggs%144)%12;
		
		System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + leftover);
		System.out.println(144*gross + 12*dozen + leftover);
	}
}