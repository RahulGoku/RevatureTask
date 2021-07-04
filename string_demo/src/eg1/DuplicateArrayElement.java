package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class DuplicateArrayElement {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Array : ");
    n=sc.nextInt();
    ArrayList<Integer>a=new ArrayList<Integer>(n);
    for(int i=0;i<n;i++) {
    	int data=sc.nextInt();
    	a.add(data);
    }
    System.out.println("Original array : ");
    for(Integer i:a)System.out.print(i+" ");
    removeDuplicateNumber(a,n);
    System.out.println("\nModified array : ");
    for(Integer i:a)System.out.print(i+" ");
    
    sc.close();	
}
public static void removeDuplicateNumber(ArrayList<Integer>a,int size) {
	Stack<Integer>st=new Stack<Integer>();
	st.push(a.get(0));
	for(int i=1;i<size;i++) {
		if(st.peek()==a.get(i))continue;
		else st.push(a.get(i));
	}
	a.clear();
	while(!st.isEmpty()) {
		a.add(st.peek());
		st.pop();
	}
	Collections.reverse(a);  
}
}
