package collection.PracticeException;

public class Exception {
	public static void main(String[] args) {
		System.out.println("Main Begin");
		String s = null;
		try {
			s = args[0];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please Provide Value ");
			System.out.println(e);
			
		}
		
		int x = 0;
		
		try {
			x = Integer.parseInt(s);
			
			System.out.println(x);
		}
		catch(NumberFormatException e) {
			System.out.println("Enter a  int value");
			System.out.println(e);
		}
		
		try {
			int y = 10/x;
			System.out.println(y);
		}
		catch(ArithmeticException e) {
			System.out.println("please dont provide zero");
			System.out.println(e);
		}
		System.out.println("main end");
	}

}
