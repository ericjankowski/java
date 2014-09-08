package com.erj.practice;

public class MergeSort {
	public static int[] sort(int [] data){
		if (data.length <= 1){
			return data;
		}else{
			int[] sorted = new int[data.length];
			int middle = data.length/2;
			int remaining = data.length-middle;
			int[] left = new int[middle];
			int[] right = new int[remaining];
			
			System.arraycopy(data, 0, left, 0, middle);
			System.arraycopy(data, middle, right, 0, remaining);
			left = sort(left);
			right = sort(right);
			
			sorted = merge(left, right);
			return sorted;
		}
	}
		 
	private static int[] merge(int[] left, int[] right){
		int[] merged = new int[left.length+right.length];
		int i = 0;
		int j = 0;
		while (i < left.length || j < right.length){
			if (i < left.length & j < right.length){
				if (left[i] <= right[j]){
					merged[i+j] = left[i];
					i++;
				}else{
					merged[i+j] = right[j];
					j++;
				}
			}else if (i < left.length){
				merged[i+j] = left[i];
				i++;
			}else if (j < right.length){
				merged[i+j] = right[j];
				j++;
			}
		}
		return merged;
	}
}

