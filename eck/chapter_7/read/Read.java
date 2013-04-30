import java.io.*;
import java.util.*;

public class Read{
	public static void main(String [] args){
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("What file would you like to read?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String filename = "";
		try{
			filename = br.readLine();
		
		
			br = new BufferedReader(new FileReader(new File(filename)));
		
			String line = br.readLine();
			while(line != null){
				StringTokenizer st = new StringTokenizer(line);
				while(st.hasMoreTokens()){
					String token = st.nextToken();
					
					if(!list.contains(token)){
						list.add(token);
					}
				}
				line = br.readLine();
			}
		}catch(Exception e){}
		
		String temp = "";
		int swaps = 1;
		while(swaps != 0){
			swaps = 0;
			for(int i = 0; i<list.size()-1;i++){
				if(list.get(i).compareTo(list.get(i+1))>0){
					list.add(i+1, list.remove(i));
					swaps++;
				}
			}
		}
		System.out.println(list);
	}
}