package day5;


import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SecondHighestElement {

	public static void main(String[] args) {
		int a[] = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5, 6, 6, 7, 7, 7, 7, 8, 8 ,9,11};
		System.out.println(secondHighestElement(a));

	}
    public static int secondHighestElement(int a[]) {
    	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    	Set<Integer>s=new HashSet<>();
    	for(int i=0;i<a.length;i++) {
    		s.add(a[i]);
    	}
    	pq.addAll(s);
    	pq.remove();
		return pq.peek();
    }
}
