import java.io.*;

public class Capitalize {
	public static void main (String [] args){
		Capitalize c = new Capitalize();
		String s = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			s = br.readLine();
		}catch(Exception e){}
		
		c.printCapitalized(s);
	}
	
	public void printCapitalized(String s){
		char [] chars = s.toCharArray();
		for(int i = 0;i<chars.length; i++){
			if(Character.isLetter(chars[i])){
				if(i==0){
					chars[i] = Character.toUpperCase(chars[i]);
				}else if(chars[i-1] == ' '){
					chars[i] = Character.toUpperCase(chars[i]);
				}else{
					chars[i] = Character.toLowerCase(chars[i]);
				}
			}
		}
		System.out.println(chars);
	}
}