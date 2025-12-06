package collection.mohit;

import java.util.Scanner;

public class CollisonOfCar {
	 public static int countCollisions(String directions) {

         int n = directions.length();
        int i = 0, j = n - 1;

       
        while (i < n && directions.charAt(i) == 'L') {
            i++;
        }

       
        while (j >= 0 && directions.charAt(j) == 'R') {
            j--;
        }

        int collisions = 0;

       
        for (int k = i; k <= j; k++) {
            char c = directions.charAt(k);
            if (c == 'L' || c == 'R') {
                collisions++;
            }
        }

        return collisions;

        
    }
	 public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Directions :");
		str= sc.next();
		System.out.println(countCollisions(str));
	}

}
