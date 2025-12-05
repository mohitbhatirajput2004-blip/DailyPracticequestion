package collection.mohit;

public class ArrayCallByValueExample {
	public static void main(String[] args) {
		int x= 10;
		System.out.println(x);
		change(x);
		System.out.println(x);
	}

	private static void change(int x) {
		x=10;
		
	}

}
