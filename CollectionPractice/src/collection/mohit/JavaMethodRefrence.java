package collection.mohit;
interface A{
//	boolean isdigit(int c);
	
	int StringLen(String s);
}
//class B{
////	static boolean check(int n) {return n> -10 && n< 10;} 
//	
//	static int StringLen(String s) {
//		return s.length();
//	}
//}
public class JavaMethodRefrence {
	public static void main(String[] args) {
//		A a = B::check;
//		System.out.println(a.isdigit(8));
//	
//	A a = B::StringLen;
//	
//	System.out.println(a.StringLen("hiii"));
		
		A a = s-> s.length();
		
		System.out.println(a.StringLen("shdsdhd"));
	
	}
			

}
