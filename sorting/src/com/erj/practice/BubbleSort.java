package com.erj.practice;

public class BubbleSort {
	public static int[] sort(int[] data){
		int temp = 0;
		for (int i = 0; i < data.length; i++){
			for (int j = (data.length-1); j >= (i+1); j--){
				if (data[j] < data[j-1]){
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}
			}
		}
		return data;
	}
}
