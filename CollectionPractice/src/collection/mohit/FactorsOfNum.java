package collection.mohit;

public class FactorsOfNum {
	
	public static int factor(int x) {
		int Count=0;	
		for(int i=1;i*i<=x;i++) {
			if(x%i==0) {
				if(x/i == i)Count++;
				else Count+=2;
			}
			
		}	
		return Count;
	}
	public static void main(String[] args) {
		int x=36;
		int sol = factor(x);
		System.out.println("\nFactors of n are : "+sol);
	}

}
