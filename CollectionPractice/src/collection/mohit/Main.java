package collection.mohit;

//Use this editor to write, compile and run your Java code online
public class Main {
 public static boolean isPalindrome(String s) {
     int n = s.length();
     s = s.toLowerCase();
     String empty ="";
     for(int i=0;i<n;i++){
         char ch =s.charAt(i);
         if(ch >= 'a' && ch <= 'z' ){
             empty+=ch;
         }
     }

     System.out.print(" "+ empty);
     
     s =empty;
     String t ="";

     for(int i = s.length()-1;i>=0;i-- ){
         t += s.charAt(i);
     }
     if(s.equals(t)){
         return true;
     }

     return false;
 }


 public static void main(String[] args) {
     String s ="A man, a plan, a canal: Panama";
     System.out.println(isPalindrome(s));
 }
}