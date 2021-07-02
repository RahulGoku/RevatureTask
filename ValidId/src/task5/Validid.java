package task5;

public class Validid {
	public static void main(String[] args) {   //Pattern AA12 20278789654
     String s="AA12 20278789654";
     if(s!=null && s.matches("[A-Z]{2}[0-9]{2}\\s[0-9]{11}")){  // Driving Number
    	 System.out.println("Valid Dl Number");
     }
     else System.out.println("Invalid Dl Number");
     
     String ad="1234 5678 9876";
	 if(ad!=null && ad.matches("[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}")){  // AAdhar Number
    	 System.out.println("Valid Aadhar Number");
     }
     else System.out.println("Invalid Aadhar Number");
	 
	 String cn="TN 37 F 4902";
	 if(cn!=null && (cn.matches("[A-Z]{2}\\s[0-9]{2}\\s[A-Z]{2}\\s[0-9]{4}") || cn.matches("[A-Z]{2}\\s[0-9]{2}\\s[A-Z]{1}\\s[0-9]{4}" ))){  // Vehicle Number
    	 System.out.println("Valid Vehicle  Number");
     }
     else System.out.println("Invalid Invalid Vehicle Number");
	 
			
	}
	
		
			
	
}
