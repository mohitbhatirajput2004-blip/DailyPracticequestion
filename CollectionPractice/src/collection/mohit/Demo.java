package collection.mohit;

enum Weekdays{
	SUNDAY,MON,TUE,SAT,THU,FRI,WED;
	
}

public class Demo {
	
	public static void main(String[] args) {
		
		Weekdays [] data =Weekdays.values();
		for(Weekdays w: data) {
			System.out.println(w);
		}
	}
	
	
	
	
 
}
