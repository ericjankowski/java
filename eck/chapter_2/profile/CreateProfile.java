import java.io.*;

public class CreateProfile {
    public static void main(String[] args) {
    	try{
        	String name;     
	        String email;    
	        double salary;   
	        String favColor; 
  
	        System.out.println("Good Afternoon!  This program will create");
	        System.out.println("your profile file, if you will just answer");
	        System.out.println("a few simple questions.");
	        System.out.println();
  
      	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new FileWriter("profile.txt"));
			
        	System.out.println("What is your name?");
	        name = br.readLine();
	        System.out.println("What is your email address?");
	        email = br.readLine();
	        System.out.println("What is your yearly income?  ");
	        salary = Double.parseDouble(br.readLine());
	        System.out.println("What is your favorite color? ");
	        favColor = br.readLine();

	        bw.write("Name:            " + name + "\n"); 
	        bw.write("Email:           " + email + "\n");
	        bw.write("Favorite Color:  " + favColor + "\n");
	        bw.write("Yearly Income:   " + salary + "\n");
	     	bw.close();
	
	        System.out.println("Thank you.  Your profile has been written to profile.txt.");
		}catch(Exception e){
			System.out.println("Charlie bit me!!  That really hurt.");
		}
        
    }
    
}