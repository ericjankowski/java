import java.io.*;

public class Split {
	public static void main (String [] args){
		String line = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			line = br.readLine();
		}catch(Exception e){}
		char[] lineArray = line.toCharArray();
		
		String currentWord = "";
		for(int i = 0;i<line.length(); i++){
			if(Character.isLetter(lineArray[i])){
				currentWord += lineArray[i];
			}else if(currentWord.length()>0){
				System.out.println(currentWord);
				currentWord = "";
			}
		}
	}
}