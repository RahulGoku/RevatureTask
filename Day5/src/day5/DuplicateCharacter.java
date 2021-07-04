package day5;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateCharacter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String : ");
	String s=sc.nextLine();
	System.out.println("Original String : "+s);
	System.out.println("Modified String : "+removeDuplicateCharacter(s));
	sc.close();
}
public static String removeDuplicateCharacter(String s) {
	Stack<Character>st=new Stack<Character>();
	st.push(s.charAt(0));
	for(int i=1;i<s.length();i++) {
		if(st.peek()==s.charAt(i))continue;
		else st.push(s.charAt(i));
	}
	s="";
	while(!st.isEmpty()) {
		s+=st.peek();
		st.pop();
	}
	return (new StringBuilder().append(s).reverse().toString());
};
}
