package com.packet.chapter;

public class Ren1_5 {
	
	public static void main(String[] argssss) {
		System.out.println(sumUp(10));
		
		System.out.println(sumUpSquares(3));
	}

	private static int sumUp(int n) {
		int sum = 0;
		if (n >= 0) {
			for (int i = 0; i <= n; i++) {
				sum = sum + i;
			}
		}
		return sum;
	}
	
	
	private static int sumUpSquares(int n) {
		int sum = 0;
		if (n >= 0) {
			for (int i = 0; i <= n; i++) {
				sum = sum + (i^2);
			}
		}
		return sum;
	}

}
