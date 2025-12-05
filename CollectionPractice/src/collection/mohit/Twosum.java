package collection.mohit;
// given an array , find  two numbers that has 50 sum .
public class Twosum {
	public static void main(String[] args) {
		int []arr= {10,15,18,28,30,40,50};
		int target=70;
		for(int i=0;i<arr.length;i++) {
			int x= target-arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==x) {
					System.out.println(i+ " "+j);
				}	
			}	
		}	
	}
}
