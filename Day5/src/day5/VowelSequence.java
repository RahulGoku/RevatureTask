package day5;
//aeiou is present in String or not.
public class VowelSequence {
public static void main(String[] args) {
	String s="radsaraecdfaeiouaeiouadssadadsad";
	System.out.println(vowelSequenceCheck(s));
}
public static boolean vowelSequenceCheck(String s) {
	String ans="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			ans+=s.charAt(i);		
		}
	}
	for(int i=0;i<=ans.length()-5;i++) {
			if(ans.substring(i,i+5).equals("aeiou"))return true;
	}
	return false;
	
}
}
