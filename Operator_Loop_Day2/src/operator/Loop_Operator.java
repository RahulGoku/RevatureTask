package operator;
import java.util.*;

public class Loop_Operator {
public static void main(String[] args) {
	int a,b,choice;
	Operator_test o = new Operator_test("Rahul");
	o.Welcome();
	System.out.println("Press 1 for Comparing the Number ");
	System.out.println("Press 2 for Logical Operator ");
	System.out.println("Press 3 Find the power  ");
	System.out.println("Press 4 Shift Operator");
	System.out.println("Press 5 for CheckPrime ");
	System.out.println("Press 6 for Time of Journey ");
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the Value of a and b and choice: ");
		a=sc.nextInt();
		b=sc.nextInt();
		choice=sc.nextInt();
	}

	
    switch(choice) {
    case 1: o.compareNumber(a, b);
            break;
    case 2: o.logicalOperator(a, b);
            break;
    case 3: o.powerOfNumber(a, b);
            break;
    case 4: o.shiftNumber(a, b);
            break;
    case 5: o.checkPrime(a);
     		break;
    case 6: o.journeyTime(a,b);
     		break;
    default : System.out.println("Enter the valid Key :");
              break;
   
    }
	
     
	
}
}
