import java.io.*;

public class Grader{
	public static void main (String [] args){
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File("testdata.txt")));
		
			String name = br.readLine();
			int grade1 = Integer.parseInt(br.readLine());
			int grade2 = Integer.parseInt(br.readLine());
			int grade3 = Integer.parseInt(br.readLine());
		
			System.out.println(name + " averaged " + (grade1 + grade2 + grade3)/3 + " on his three exams.");
		}catch(Exception e){}
	}
}