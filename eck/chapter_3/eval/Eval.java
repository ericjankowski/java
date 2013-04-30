import java.io.*;
import java.util.*;

public class Eval{
	public static void main (String [] args){
		String expression = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			expression = br.readLine();
		}catch(Exception e){}
		StringTokenizer st = new StringTokenizer(expression);
		double arg1 = Double.parseDouble(st.nextToken());
		String operator = st.nextToken();
		double arg2 = Double.parseDouble(st.nextToken());
		
		if("+".equals(operator)){
			System.out.println(arg1 + " + " + arg2 + " = " + (arg1+arg2));
		}else if("-".equals(operator)){
			System.out.println(arg1 + " - " + arg2 + " = " + (arg1-arg2));
		}else if("*".equals(operator)){
			System.out.println(arg1 + " * " + arg2 + " = " + (arg1*arg2));
		}else if("/".equals(operator)){
			System.out.println(arg1 + " / " + arg2 + " = " + (arg1/arg2));
		}
	}
}