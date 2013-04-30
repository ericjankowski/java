import java.io.*;

public class Maths{
	public static void main(String [] args){
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		boolean error = false;
		boolean again = true;
		double solution = 0.0;
		
		while(again){
			error = false;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("A*x*x + B*x + C = 0 \nEnter the first number A: ");
			try{
				a = Double.parseDouble(br.readLine());
			}catch(Exception e){
				System.out.println("There was an error trying to collect and understand your input.");
				error = true;
				break;
			}
			if(!error){
				System.out.println("A*x*x + B*x + C = 0 \nEnter the second number B:");
				try{
					b = Double.parseDouble(br.readLine());
				}catch(Exception e){
					System.out.println("There was an error trying to collect and understand your input.");
					error = true;
					break;
				}
			}
			if(!error){
				System.out.println("A*x*x + B*x + C = 0 \nEnter the third number C:");
				try{
					c = Double.parseDouble(br.readLine());
				}catch(Exception e){
					System.out.println("There was an error trying to collect and understand your input.");
					error = true;
					break;
				}
			}
			
			if(!error){
				try{
					solution = root(a,b,c);
				}catch(Exception e){
					System.out.println("There was an error in the calculation, please check your values.\nA: " + a +"\nB: " + b + "\nC: " + c + "\nThese coefficients are not possible.");
					error = true;
				}
			}
			
			if(!error){
				System.out.println("Solution: " + solution);
			}
			
			System.out.println("\n\nWould you like to continue? y/n");
			try{
				again = br.readLine().equals("y");
			}catch(Exception e){
				again = false;
			}
		}
	}
	
	/**
	 * Returns the larger of the two roots of the quadratic equation
	 * A*x*x + B*x + C = 0, provided it has any roots.  If A == 0 or
	 * if the discriminant, B*B - 4*A*C, is negative, then an exception
	 * of type IllegalArgumentException is thrown.
	 */
	static public double root( double A, double B, double C ) 
	                              throws IllegalArgumentException {
	    if (A == 0) {
	      throw new IllegalArgumentException("A can't be zero.");
	    }
	    else {
	       double disc = B*B - 4*A*C;
	       if (disc < 0)
	          throw new IllegalArgumentException("Discriminant < zero.");
	       return  (-B + Math.sqrt(disc)) / (2*A);
	    }
	}
}