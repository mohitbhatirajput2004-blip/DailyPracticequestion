package collection.mohit;
//w.a.p to reverse array without using any extra array
public class ReverseArray {
	public static void main(String[] args) {
		int []arr= {10,20,30,40,50};
		
		System.out.println("Original  Array : ");
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		int n= arr.length;
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
	
			
		}
		System.out.println("\nReverse Array : ");
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}

}
