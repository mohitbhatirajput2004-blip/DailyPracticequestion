package collection.mohit;

//functional-Interface or SAM(Single Abstract Method)
interface I{
	void LargestNum(int a , int b);
	
	
}
public class FunctionalInterface {
	
	public static void main(String[] args) {
		
		I i1 = (a ,b) -> {            
			                            
			System.out.println(a > b ? a:b);    
		};
		
		i1.LargestNum(100,20);
	}
}
