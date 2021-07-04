package day5;
import java.util.HashSet;

//Find all the palindrome in an array
public class AllPalindrome {
public static void main(String[] args) {
	String s="abaaa";
	System.out.println(checkVowelOrder(s));
	
}
 public static String checkVowelOrder(String s) {
	 
	 HashSet<String> ans = new HashSet<String>();
	 for(int i=0;i<s.length();i++){
		 for(int j=i;j<s.length();j++) {
			 String r= s.substring(i,j+1);
			 if(new StringBuilder(r).reverse().toString().equals(r)) ans.add(r);
		 }
	 }
	 return ans.toString();
 }
	 
}
