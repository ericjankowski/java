package com.erj.practice;

public class Shifting {
	public static void main(String[] args) {
		int num = 1;
		for(int i = 0; i < 33; i++){
			System.out.println(num);
			num = num << 1;
		}
		System.out.println("**********************");
		num = 1000000000;
		for(int i = 0; i < 33; i++){
			System.out.println(num);
			num = num >> 1;
		}
		System.out.println("**********************");
		System.out.println(~0 & 0);
		System.out.println(~10 & 10);
		System.out.println("**********************");
		System.out.println(~0 | 0);
		System.out.println(~10 | 10);
	}
}
