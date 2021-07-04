package stringbuilder;
//Convert Last Position  to Block Letter
import java.util.Scanner;

public class StringQuery {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		System.out.println(stringLastCaps(s));
		sc.close();

	}

	public static String stringLastCaps(String s) {
		String ans = "";
		StringBuilder sb = new StringBuilder();
		String ar[] = s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			sb.append(ar[i].substring(0, (ar[i].length() - 1)))
					.append(Character.toUpperCase(ar[i].charAt((ar[i].length()) - 1))).append(" ");
		}
		ans += sb.toString().trim();
		return ans;
	}

}
