package collection.mohit;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size for 2d  array row and column : ");
		int r = sc.nextInt();
		int col = sc.nextInt();
		int arr[][]= new int[r][col];
		System.out.println("Enter Elements in array : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		
		

				
		for(int i=0;i<r;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
