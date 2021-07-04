package day5;

import java.util.ArrayList;

public class PalindromeElement {

	public static void main(String args[]) {
		int[] arr = { 111, 121, 222, 333, 444 };
		// int[] arr = {121, 131, 20} ;

		int n = arr.length;

		System.out.println(palindromeElementArray(arr, n));

	}

	public static boolean isPalindrome(int N) {
		String str = "" + N;
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i))
				return false;
		}
		return true;
	}

	public static ArrayList<Integer> palindromeElementArray(int[] arr, int n) {
		ArrayList<Integer> A = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			boolean ans = isPalindrome(arr[i]);
			if (ans == true)
				A.add(arr[i]);

		}
		return A;
	}
}
