package com.packet.chapter;

public class Ren1_6 {
	
	public static void main(String[] argssss) {
		System.out.println(sumUpOddPositive(5));
	}
    /// Returns the sum of all positive integers less than or equal to n
	private static int sumUpOddPositive(int n) {
		int sum = 0;
		if (n >= 0 ) {
			for (int i = 0; i <= n; i++) {
				if(i%2 != 0)
				sum = sum + i;
			}
		}
		return sum;
	}
	
	
	/// Returns the sum of all positive integers less than or equal to n
		private static int sumUpPositive(int n) {
			int sum = 0;
			if (n >= 0 ) {
				for (int i = 0; i <= n; i++) {
					if(i%2 != 0)
					sum = sum + i;
				}
			}
			return sum;
		}

}
