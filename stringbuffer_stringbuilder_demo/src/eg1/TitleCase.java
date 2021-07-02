package eg1;

public class TitleCase {

	public static void main(String[] args) {
		
		String s="hello hi good evening everyone hope you are enjoying progamming with java";
		StringBuilder sb=new StringBuilder();
		String ar[]=s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
		}
		
		System.out.println(sb.toString().trim());

	}

}
//Task - 1) Convert last character of every word to uppercase and print back the whole sentence
// 		 2) If the string is of length even then convert first char to uppercase if it is odd then convert middle char to uppercase