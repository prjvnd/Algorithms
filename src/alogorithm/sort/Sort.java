package alogorithm.sort;

public class Sort {

	
	public static void main(String[] args) {
		
		int [] num = {10,9,18,4};
		
		val(num);
		
	}
		
	public static int[] val(int []  val) {
		
		for(int i =0; i < val.length-1;i++) {
			
		for(int j =1; j< val.length;j++)
		{
			
		   if(val[i] > val[j]) {
			   int temp = val[i];
			   val[i] = val[j];
			   val[j] = temp;
			   
			   System.out.println("swapping....");
		   }
			
		   printf(val);
		   System.out.println();
			
		}
		}
		
		return val;
	}
	
	public static void printf(int[] val) {
		for(int l =0; l<val.length;l++) {
			System.out.print(val[l]+ " , ");
		}
	}
}
