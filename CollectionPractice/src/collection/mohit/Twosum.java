package collection.mohit;
// given an array , find  two numbers that has 50 sum .
public class Twosum {
	public static void main(String[] args) {
		int []arr= {20,10,25,40,55,60,14,36};
		int target=50;
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
