package collection.mohit;
//find the maximum  value out of all items  in the array 
public class MaxElement {
	public static void main(String[] args) {
		int max=0;
		int arr[]= {20,40,70,11,99,2222,1};
		
		for(int i=0; i<arr.length;i++) {
			
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		System.out.println("Max Element is : "+ max);
		
	}

}
