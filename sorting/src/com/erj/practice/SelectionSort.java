package com.erj.practice;

public class SelectionSort {
	
	public static int[] sort(int[] data){
//		int j = 0;
//		int temp = 0;
//		for (int i=0; i<data.length; i++){
//			j = i;
//			for (int k = i; k<data.length; k++){
//				if (data[j]>data[k]){
//					j = k;
//				}
//			}
//			temp = data[i];
//			data[i] = data[j];
//			data[j] = temp;
//		}
//		return data;
		
		for (int i = 0; i<data.length; i++){
			for (int j = i; j < data.length; j++){
				if(data[i] > data [j]){
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		return data;
	}
}
