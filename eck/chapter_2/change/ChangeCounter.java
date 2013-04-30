import java.io.*;

public class ChangeCounter{
	public static void main (String [] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("How many quarters do you have?");
			int quarters = Integer.parseInt(br.readLine());
			System.out.println("How many dimes do you have?");
			int dimes = Integer.parseInt(br.readLine());
			System.out.println("How many nickels do you have?");
			int nickels = Integer.parseInt(br.readLine());
			System.out.println("How many pennies do you have?");
			int pennies = Integer.parseInt(br.readLine());
			
			int cents = quarters*25 + dimes*10 + nickels*5 + pennies;
			double dollars = cents/100.0;
			
			System.out.println("You have $" + dollars);
		}catch(Exception e){}
	}
	
}