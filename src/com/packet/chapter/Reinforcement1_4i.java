package com.packet.chapter;

public class Reinforcement1_4i {
	
	public static void main(String[] args) {
		
		System.out.println(isEven(-9));
	}
	 //Reinforcement 1.4
	
	private static boolean isEven(int n) {
		boolean val = true;
		for(int i = 0; i < Math.abs(n) ; i++) {
			val = !val;
		}
		
		return val;
	}

}
