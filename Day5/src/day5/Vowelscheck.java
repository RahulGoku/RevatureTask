package day5;

import java.util.HashSet;
import java.util.Scanner;

public class Vowelscheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String s = sc.nextLine();
		System.out.println(vowelCheck(s));
		sc.close();
	}

	public static boolean vowelCheck(String s) {
		s = s.replaceAll("[^aeiou]", "");
		HashSet<Character> ans = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			ans.add(s.charAt(i));
		}
		System.out.println(ans);
		if (ans.size() == 5)
			return true;
		else
			return false;
	}
}
