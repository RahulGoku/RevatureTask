package day5;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HighestOcuuringNumber {

	public static void main(String[] args) {
		int a[] = { 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5, 6, 6, 7 };
		System.out.println(highestOccuringNumber(a));

	}

	public static int highestOccuringNumber(int a[]) {
		Map<Integer, Integer> freq = new TreeMap<>();
		int result = Integer.MIN_VALUE;
		int result1 = 0;

		for (int num : a) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}
		Iterator<Entry<Integer, Integer>> itr = freq.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, Integer> fq = itr.next();
			int data = fq.getValue();
			if (data > result) {
				result = data;
				result1 = fq.getKey();
			}
			System.out.println("Key = " + fq.getKey() + ", Value = " + fq.getValue());
		}

		return result1;
	}

}
