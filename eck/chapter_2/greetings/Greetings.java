import java.io.*;

public class Greetings {
	public static void main (String [] args){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Who goes there?\n");
		try{
			String name = in.readLine().toUpperCase();
			System.out.println("Hello, " + name + ".  Nice to meet you!\n");
		}catch(Exception e){}
		
	}
}