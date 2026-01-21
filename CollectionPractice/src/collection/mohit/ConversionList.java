package collection.mohit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConversionList {
	public static void main(String[] args) {
		 //array to List 
//		
//		String arr[] = {"HI" , "OK" , "HI"};
//		
//		//Arrays.asList(arr)
//		
//		List <String> l = Arrays.asList(arr);
//	//	l.add("abs");
//		
//		System.out.println(l);
//		
//		List <String> l1 = new ArrayList<>(Arrays.asList(arr));
//		l1.add("abc");
//		
//		System.out.println(l1);
//		
//		Set <String> s = new HashSet<>(Arrays.asList(arr));
//		
//		System.out.println(s);
		
		//List to array 
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		
		Integer arr[] = l.toArray(new Integer[0]);
		
		for(int a : arr) {
			System.out.println(a);
		}
		System.out.println(Arrays.toString(arr));
		
		
		Set<Integer> s = new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		
		Integer arr2[] = s.toArray(new Integer[0]);
		
		for(int a: arr2) {
			System.out.println(a);
		}
		
		
		}
	
	

}

