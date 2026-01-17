package collection.mohit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConversionList {
	public static void main(String[] args) {
//		String arr[] = {"java" , "python" , "cpp" , "java"};
//		
//		List<String> l = new ArrayList<>(Arrays.asList(arr));		
//		l.add("hii");
//		System.out.println(l);
//		
//		Set<String> s = new HashSet<>(Arrays.asList(arr));
//		s.add("okkkkkkkk");
//		
//		System.out.println(s);
		
		List<String> l = new ArrayList<>();
		l.add("jii");
		l.add("ojksj");
		l.add("sgdjhs");
		
		
	
		String[] arr = l.toArray(new String[0]);
		
		for(String a : arr) {
			System.out.println(a);
		}
		
		
		
		Set<Integer> s = new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		
		Integer arr2[] = s.toArray(new Integer[0]);
		
		
		for(Integer a :  arr2) {
			System.out.println(a);
		}
	}
		
}
