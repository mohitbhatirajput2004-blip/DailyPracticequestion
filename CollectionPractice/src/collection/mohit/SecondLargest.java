package collection.mohit;
//Print the second largest element in array.
public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};

        int l = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > l) {
                s = l;
                l = num;
            } else if (num > s && num != l) {
                s = num;
            }
        }

        System.out.println("Second Largest: " + s);

	}

}
