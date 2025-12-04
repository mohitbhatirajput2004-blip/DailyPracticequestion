package collection.mohit;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		ArrayDeque  ad = new ArrayDeque();
		ad.add(1);
		ad.addLast(44);
		ad.add(2);
		ad.add(11);
		ad.addFirst("hiiiiiii");
		
		System.out.println(ad);
	}
}
