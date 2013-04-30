import java.io.*;

public class Sales {
	public static void main (String [] args){
		String line = "";
		double total = 0.0;
		int numCitiesReporting = 0;
		int numCitiesNotReporting = 0;
		try{
			BufferedReader br = new BufferedReader(new FileReader(new File("sales.dat")));
			line=br.readLine();
			while(line != null){
				String [] pair = line.split(":");
				try{
					total += Double.parseDouble(pair[1].trim());
					numCitiesReporting++;
				}catch(NumberFormatException e){
					numCitiesNotReporting++;
				}
				line=br.readLine();
			}
		}catch(Exception e){}
		System.out.println("Number of Cities Reporting: " + numCitiesReporting);
		System.out.println("Number of Cities Not Reporting: " + numCitiesNotReporting);
		System.out.println("Total Sales: " + total);		
	}
}