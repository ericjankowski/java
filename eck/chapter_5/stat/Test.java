import java.io.*;

public class Test{
	public static void main (String [] args){
		StatCalc c = new StatCalc();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String val = br.readLine();
			while (!val.trim().equals("0")){
				c.enter(Double.parseDouble(val));
				val = br.readLine();
			}
		}catch(Exception e){}
		System.out.println("Count: " + c.getCount());
		System.out.println("Sum:   " + c.getSum());
		System.out.println("Mean:  " + c.getMean());
		System.out.println("StD:   " + c.getStandardDeviation());
		System.out.println("Min:   " + c.getMin());
		System.out.println("Max:   " + c.getMax());
	}
}