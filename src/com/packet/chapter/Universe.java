package com.packet.chapter;

public class Universe {
	
	public static void main(String[] args) {
		System.out.println("hELLO");
	 
		int[] gameEntry = {12,23,45,234,345,23,12};
		
		int [] b = gameEntry.clone();
		
		gameEntry[4] = 550;
		
		System.out.println(gameEntry == b ? "same ":"different");
		
		System.out.println(b[4]);
	
	}

}
