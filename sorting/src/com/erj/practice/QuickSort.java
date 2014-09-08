package com.erj.practice;

public class QuickSort {
	public static int[] sort(int[] data){
		int pivot = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		
		if (data.length < 2){
			return data;
		} else {
			int[] left = new int[data.length];
			int[] right = new int[data.length];
			int[] sorted = new int[data.length];
			pivot = data[data.length/2];
			
			for (i = 0; i < data.length; i++){
				if (i != data.length/2){
					if (data[i] < pivot){
						left[j] = data[i];
						j++;
					}else{
						right[k] = data[i];
						k++;
					}
				}
			}
			
			int[] sortedLeft = new int[j];
			int[] sortedRight = new int[k];
			System.arraycopy(left, 0, sortedLeft, 0, j);
			System.arraycopy(right, 0, sortedRight, 0, k);
			
			sortedLeft = sort(sortedLeft);
			sortedRight = sort(sortedRight);
			
			System.arraycopy(sortedLeft, 0, sorted, 0, j);
			sorted[j] = pivot;
			System.arraycopy(sortedRight, 0, sorted, j+1, k);
			
			return sorted;
		}
	}
}
