package collection.mohit;

import java.util.Scanner;

public class DivideTwoInteger {
	
	    public static int divide(int dividend, int divisor) {
	       
	         if (dividend == Integer.MIN_VALUE && divisor == -1) {
	            return Integer.MAX_VALUE;
	        }
	        if (dividend == Integer.MIN_VALUE && divisor > 1 ) {
	            return  dividend/divisor;
	        }
	       

	        int ans = (dividend) / (divisor);

	       return ans;
	        
	    }
	    public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter dividend and Divisor respectively : ");
			int div = sc.nextInt();
			int ds=sc.nextInt();
			
			System.out.println("Answer is  : "+divide(div,ds));
		}
}


