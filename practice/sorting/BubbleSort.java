public class BubbleSort{
	public static void main(String [] args){
		int [] nums = new int [20];
		for(int i = 0; i<nums.length; i++){
			nums[i] = (int)(Math.random()*1000 + 1);
		}
		
		
		int swaps = 1;
		while(swaps != 0){
			swaps = 0;
			for(int i = 0;i<nums.length-1; i++){
				if(nums[i]>nums[i+1]){
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
					swaps++;
				}
			}
		}
		
		for(int i = 0; i<nums.length-1;i++){
			System.out.print(nums[i] + ", ");
		}
		System.out.print(nums[nums.length-1] + "\n\n");
	}
}