package recursion.binary_search;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		int target = 16;
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		System.out.println(target + " is located at index " + binarySearch(array, 0, array.length-1, target) + " of the array.");
	}
	
	public static int binarySearch(int[] array, int minimumIndex, int maximumIndex, int target){
		int middleIndex = (minimumIndex + maximumIndex) / 2;
		System.out.println("Guessing: " + middleIndex);
		if (array[middleIndex] == target){
			return middleIndex;
		}else if (array[middleIndex] > target){
			return binarySearch(array, minimumIndex, middleIndex-1, target);
		}else if (array[middleIndex] < target){
			return binarySearch(array, middleIndex+1, maximumIndex, target);
		}else{
			return -1;
		}
	}
}
