package day5;

public class PrimeIndexCharacterCase {
	public static void main(String[] args) {
		String s = "how are you buddy";
		System.out.println(stringPrimeCaps(s));
	}

	public static String stringPrimeCaps(String s) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (prime(i) == 0) {
				ans += Character.toUpperCase(s.charAt(i));
			} else
				ans += s.charAt(i);
		}
		return ans;
	}

	public static int prime(int index) {
		int flag = 0;
		if (index <= 1) {
			flag = 1;
		} else {
			for (int i = 2; i <= index / 2; i++) {
				if (index % i == 0) {
					flag = 1;
					break;
				} else
					continue;
			}
		}
		if (flag == 0)
			return 0;
		else
			return 1;

	}
}
