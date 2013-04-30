import java.io.*;

public class Hex {
	
	public static void main (String [] args){
		String in = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			in = br.readLine();
		}catch(Exception e){}
		int value = 0;
		for(int i = 0; i < in.length(); i++){
			value = value*16 + hexValue(Character.toLowerCase(in.charAt(i)));
		}
		System.out.println(value);
	}
	
	
	public static int hexValue(char c){
		int val = 0;
		switch (c){
			case '0': val = 0; break;
			case '1': val = 1; break;
			case '2': val = 2; break;
			case '3': val = 3; break;
			case '4': val = 4; break;
			case '5': val = 5; break;
			case '6': val = 6; break;
			case '7': val = 7; break;
			case '8': val = 8; break;
			case '9': val = 9; break;
			case 'a': val = 10;	break;
			case 'b': val = 11;	break;
			case 'c': val = 12;	break;
			case 'd': val = 13;	break;
			case 'e': val = 14;	break;
			case 'f': val = 15;	break;
			default: val = -1;
		}
		return val;
	}
}