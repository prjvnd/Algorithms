package com.packet.chapter;

import java.util.Objects;

public class CheckPalondrome {
	
	public static void main(String[] args) {
		System.out.println(isPalondrome("NITIN"));
	}
	
	
	
	public static boolean isPalondrome(String val) {
		boolean b = false ;
		if(val != null && !val.isEmpty()) {
			StringBuffer sb = new StringBuffer();
			String reversed = sb.append(val).reverse().toString();
		    System.out.println(reversed);
		    
		    
		    /**
		     * 
		     == tests for reference equality (whether they are the same object).

              . equals() tests for value equality (whether they are logically "equal").
		     */
			return b = Objects.equals(val, reversed);
		}
		
		return b;
	}

}
