package day5;

public class AverageEvenOdd {
public static void main(String[] args) {
	//int [] ar=new int[10];
	int evencount=0,oddcount=0,even=0,odd=0;
	int[] ar= {1,2,3,4,5,6,7,8,9,10};
	for(int i=0;i<10;i++) {
		if(ar[i]%2==0) {
			even+=ar[i];
			evencount++;
		}
		else {
			odd+=ar[i];
			oddcount++;
		}
	}
	
	System.out.println("Average of elements having even value in Array ar :"+even/evencount);
	System.out.println("Average of elements having odd value in Array ar :"+odd/oddcount);
	
}

}
