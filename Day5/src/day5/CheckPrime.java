package day5;
//Find all the  Prime numbers in an array

import java.util.HashSet;

public class CheckPrime {
 public static void main(String[] args) {
	int p[] = {1,11,23,12,53,12,53,12,55,66};
	System.out.println(checkPrime(p));
	
	
}
 public static String checkPrime(int a[]) {
	HashSet<Integer> ans = new HashSet<Integer>();
	for(int i=0;i<a.length;i++){
		int flag=0;
		if(a[i]<=1)continue;
		else {
			for(int j=2;j<=a[i]/2;j++) {
				if(a[i]%j==0) {
					flag=1;
					break;
				}
				else flag=0;
			}
		}
		if(flag==0)ans.add(a[i]);
	}
	return ans.toString();
	 
 }
}
