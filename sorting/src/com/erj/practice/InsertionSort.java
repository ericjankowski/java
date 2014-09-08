package com.erj.practice;

public class InsertionSort {
	public static int[] sort(int [] data){
		int temp = 0;
		int i = 0;
		for (int j = 1; j < data.length; j++){
			temp = data[j];
			i = j-1;
			while (i >= 0 && data[i] > temp){
				data[i+1] = data[i];
				i = i-1;
				data[i+1]=temp;
			}
		}
		return data;
	}
}
