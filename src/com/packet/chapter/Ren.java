package com.packet.chapter;

import java.util.Arrays;
import java.util.List;

public class Ren {
	
	public static void main(String[] args) {
		
		System.out.println(countVowels("Applee"));
		
	}
	
	private static int countVowels(String arjh) {
		int count = 0;
		if(arjh != null && !arjh.isEmpty()) {
			
		  String [] special = arjh.split("");
		  List<String> flow = Arrays.asList(special);
		  
		  for(int i=0; i<flow.size();i++) {
			  if(flow.get(i).toLowerCase().equalsIgnoreCase("a") || 
					  flow.get(i).toLowerCase().equalsIgnoreCase("e") || flow.get(i).toLowerCase().equalsIgnoreCase("i")
					  ||flow.get(i).toLowerCase().equalsIgnoreCase("o") || flow.get(i).toLowerCase().equalsIgnoreCase("u"))
           count = count +1;		
		  }
			
			
		}
		return count;
	}

}
