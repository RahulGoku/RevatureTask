package operator;

public class Operator_test {
public void compareNumber(int a,int b) {
	if(a>b) System.out.println(a+"is Greater Than "+b);
	else if(a<b)System.out.println(a+"is Smaller Than "+b);
	else System.out.println(a+"is Equal to the "+b);
}
public void shiftNumber(int a,int b) {
	System.out.println("Value Before Shift "+a);
	int c=a<<b;
	System.out.println("Value After Shift "+c);
}
public void logicalOperator(int a,int b) {
	if(a>0 && b>0)System.out.println("\nGood");
	else System.out.println("\nBad");
}
public void powerOfNumber(int a,int b) {
	System.out.println(b+" to the power "+a+" is "+Math.pow(a,b));
}
public void Table(int a) {
	for(int i=1;i<=10;i++) System.out.println(a+" * "+i+" is "+(a*i));
}
public void journeyTime(int Distance,int Speed) {
	if(Speed<=0)System.out.println("Still not Started");
	else {
		System.out.println("Time for whole journey in hour "+(Distance/Speed));
	}
	
	
}
}