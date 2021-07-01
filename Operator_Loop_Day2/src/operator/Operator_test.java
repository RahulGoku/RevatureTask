package operator;

public class Operator_test {
private String p;
public Operator_test(String p) {
	this.p=p;
}
public void Welcome() {
	System.out.println("Welcome to Program :"+p);
}
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
public void checkPrime(int a) {
	int flag=0;
	if(a<=1)System.out.println("Not A Prime Number");
	else{
		for(int i=2;i<=a/2;i++) {
		if(a%i==0) {
			flag=1;
			break;
		}	
		else {
			flag=0;
			continue;
	}
	}
	}
	if(flag==1)System.out.println("Not a Prime Number");
	else System.out.println("Prime Number");
    
}
public void journeyTime(int Distance,int Speed) {
	if(Speed<=0)System.out.println("Still not Started");
	else {
		System.out.println("Time for whole journey in hour "+(Distance/Speed));
	}
	
	
}
}
