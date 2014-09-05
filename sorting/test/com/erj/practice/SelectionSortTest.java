package com.erj.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void oneElement() {
		int [] data = {1};
		
		assertTrue(compareArrays(data, SelectionSort.sort(data)));
	}
	
	@Test
	public void twoOrderedElements() {
		int [] data = {1, 2};
		
		assertTrue(compareArrays(data, SelectionSort.sort(data)));
	}
	
	@Test
	public void twoUnorderedElements() {
		int [] data = {2, 1};
		int [] expected = {1, 2};
		
		assertTrue(compareArrays(expected, SelectionSort.sort(data)));
	}
	
	@Test
	public void tenUnorderedElements() {
		int [] data = {2, 1, 10, 3, 9, 4, 8, 5, 6, 7};
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		assertTrue(compareArrays(expected, SelectionSort.sort(data)));
	}
	
	@Test
	public void biggerArrays(){
		int [] data = {82, 81, 90, 83, 89, 84, 88, 85, 86, 87, 92, 91, 100, 93, 99, 94, 98, 95, 96, 97, 62, 61, 70, 63, 69, 64, 68, 65, 66, 67, 72, 71, 80, 73, 79, 74, 78, 75, 76, 77, 52, 51, 60, 53, 59, 54, 58, 55, 56, 57, 42, 41, 50, 43, 49, 44, 48, 45, 46, 47, 2, 1, 10, 3, 9, 4, 8, 5, 6, 7, 12, 11, 20, 13, 19, 14, 18, 15, 16, 17, 22, 21, 30, 23, 29, 24, 28, 25, 26, 27, 32, 31, 40, 33, 39, 34, 38, 35, 36, 37};
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
		
		assertTrue(compareArrays(expected, SelectionSort.sort(data)));
	}
	
	private boolean compareArrays(int [] expected, int [] actual){
		if (expected.length != actual.length){
			return false;
		}else{
			boolean equals = true;
			for (int i = 0; i<expected.length; i++){
				if (expected[i] != actual [i]){
					equals = false;
					break;
				}
			}
			return equals;
		}
	}

}
