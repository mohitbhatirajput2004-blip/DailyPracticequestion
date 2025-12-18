package collection.mohit;

enum Weekdays{
	SUNDAY,MON,TUE,SAT,THU,FRI,WED;
	
}

public class Demo {
	
	public static void main(String[] args) {
		String s1 ="1236";
		String s2 = new String("1236");
		
		if(s1 == s2) {
			
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}	
		s1 = s2.intern();
         if(s1 == s2) {
			
			System.out.println("True ref");
		}
		else {
			System.out.println("false");
		}	
	}
}




