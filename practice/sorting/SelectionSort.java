public class SelectionSort{
	public static void main(String [] args){
		int [] nums = new int [10000];
		for(int i = 0; i<nums.length; i++){
			nums[i] = (int)(Math.random()*1000 + 1);
		}
		
		nums = sort(nums);
		
		for(int i = 0; i<nums.length-1;i++){
			System.out.print(nums[i] + ", ");
		}
		System.out.print(nums[nums.length-1] + "\n\n");
	}
	
	private static int [] sort(int [] nums){
		if(nums.length == 1){
			return nums;
		}
		
		int min = nums[0];
		int index = 0;
		for(int i = 1;i<nums.length;i++){
			if(nums[i] < min){
				min = nums[i];
				index = i;
			}
		}	
		nums[index] = nums[0];
		nums[0] = min;
		int [] sub = new int [nums.length-1];
		for(int i=1;i<nums.length;i++){
			sub[i-1]=nums[i];
		}
		
		sub = sort(sub);
		
		for(int i=0;i<nums.length-1;i++){
			nums[i+1]=sub[i];
		}
		
		return nums;
	}
}