package collection.mohit;

public class ArrayCallByRefrence {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,55,60};
		System.out.println(arr[0]);
		
		change(arr);
		System.out.println(arr[0]);
	}

	private static void change(int[] arr) {
		 arr[0]=100;
	}

}
