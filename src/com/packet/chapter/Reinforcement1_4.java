package com.packet.chapter;

public class Reinforcement1_4 {
	
	
	public static void main(String[] args) {
		long p = 2000;
		long q = 20;
		
		System.out.println(isMultiple(p,q));
	}
	
	
	public static boolean isMultiple(long m , long n ) {
	
		return m%n == 0;
	}

}
