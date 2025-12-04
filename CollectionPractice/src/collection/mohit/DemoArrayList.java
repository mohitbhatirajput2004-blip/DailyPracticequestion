package collection.mohit;

import java.util.ArrayList;

public class DemoArrayList {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList(); //hetregoneous elements
		arr.add("1");
		arr.add(2);
		arr.add(10.5);
		arr.add('c');
		arr.add(true);
		
	
		ArrayList a2 = new ArrayList();
		
		a2.addAll(arr);
		a2.add(5);
		
		System.out.println(a2);
	}

}
