import java.io.*;

public class Sort{
	public static void main (String [] args){
		int [] start = new int[100];
		int index = 0;
		int count = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String in = br.readLine();
			while(!"0".equals(in)){
				start[index] = Integer.parseInt(in);
				index++;
				in = br.readLine();
			}
		}catch(Exception e){}
		
		for(int i=0;i<100;i++){
			if(start[i]!=0){
				count ++;
			}
		}
		
		int [] end = new int[count];
		index = 0;
		for(int i=0;i<100;i++){
			if(start[i] != 0){
				end[index] = start[i];
				index++;
			}
		}
		int temp;
		for(int i=0;i<count;i++){
			for(int j=0;j<count;j++){
				if(i<j && end[i] > end[j]){
					temp = end[i];
					end[i] = end[j];
					end[j] = temp;
				}
				if(i>j && end[i] < end[j]){
					temp = end[i];
					end[i] = end[j];
					end[j] = temp;
				}
			}
		}
		String out = "";
		for(int i = 0;i<count-1;i++){
			out += end[i] + ", "; 
		}
		out += end[count-1];
		
		System.out.println(out);
	}
}