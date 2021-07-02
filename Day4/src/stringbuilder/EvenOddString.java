package stringbuilder;

import java.util.Scanner;

public abstract class EvenOddString {
	public static void main(String[] args) {
		     Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the String");
			 String s=sc.nextLine();
			 System.out.println(stringOddEven(s));
			 sc.close();
		
		
	}
   public static String stringOddEven(String s) {
	   String ans="";
	   if(s.length()%2==0) {
		   StringBuilder sb=new StringBuilder();
			String ar[]=s.split(" ");
			for (int i = 0; i < ar.length; i++) {
				sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
			}
			ans+=sb.toString().trim();	
	   }
	   else {
		   StringBuilder sb=new StringBuilder();
			String ar[]=s.split(" ");
			for (int i = 0; i < ar.length; i++) {
				int l=ar[i].length();
				sb.append(ar[i].substring(0,l/2)).append(Character.toUpperCase(ar[i].charAt(l/2))).append(ar[i].substring(l/2+1)).append(" ");
			}
			ans+=sb.toString().trim();	
	   }
	   return ans;
   }
}
