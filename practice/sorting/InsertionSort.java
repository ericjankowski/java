public class InsertionSort{
	
	//I gave up on this Feb 2, 2013
	public static void main(String [] args){
		
		int [] nums = new int [20];
		for(int i = 0; i<nums.length; i++){
			nums[i] = (int)(Math.random()*1000 + 1);
		}
		
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<i+1;j++){
				
			}
		}
		
		for(int i = 0; i<nums.length-1;i++){
			System.out.print(nums[i] + ", ");
		}
		System.out.print(nums[nums.length-1] + "\n\n");
	}
}