package com.recursive;
/*
 * 
 * this is thje example of recursive programming
 */
public class Sing {
	
	public static void main(String[] args) {
		int [] k = {1,4,2};
		System.out.println(isArraySorted(k,1));
		//solve(3,"a","b","c");
	}
	
	public static long Factorial(int n) {
		if(n ==0) {
			return 1;
		}else {
			return n*Factorial(n-1);
		}
	}
	
	   public static void solve(int n, String start, String auxiliary, String end) {
	       if (n == 1) {
	           System.out.println(start + " -> " + end);
	       } else {
	           solve(n - 1, start, end, auxiliary);
	           System.out.println(start + " -> " + end);
	           solve(n - 1, auxiliary, start, end);
	 
	       }
	   }
	// hanoi tower problem 
	
	public static void hanoiProblem(int n, String from, String to, String aux) {
		System.out.println(n);
		if( n==1) {
			System.out.println("Moving the disk n="+n+ " From "+from+ "to "+to);
			return;
		}else {
		
		hanoiProblem(n-1,from,aux,to);
		
		hanoiProblem(n-1,aux,to,from);
		}
		
	}
	
	
	
	public static int isArraySorted(int[] A, int index) {
		if(A.length==1) {
			return 1;
		}
		return (A[index-1] <A[index-2]? 0 : isArraySorted(A,index-1));
	}

}
