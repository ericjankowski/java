package com.erj.practice;

//http://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html
public class BitDemo { 
	public static void main(String [] args){
		int bitmask = 0x000F;
		int val = 0x2222;
		
		System.out.println("bitmask: " + bitmask + 					"\t\t = 0000000001111");
		System.out.println("val: " + val + 							"\t\t = 1001000100010");
		
		System.out.println("val & bitmask = " + (val & bitmask) + 	"\t = 0000000000010");
	}
}
