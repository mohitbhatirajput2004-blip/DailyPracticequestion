package collection.PracticeException;

import java.util.Scanner;

public class SockOrder {
	void OrderAmount(int num) {
		if(num >= 500){
			System.out.println("Order Confirmed");
		}
		else{
			throw new CustomException("Order Amount Low");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Order Amount");
		int x = sc.nextInt();
		SockOrder so = new SockOrder();
		try {
		so.OrderAmount(x);
	}
	catch(CustomException e) {
		System.out.println(e);
		
	}	
	}
}
