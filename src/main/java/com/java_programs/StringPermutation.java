package main.java.com.java_programs;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
	 Set<String> set = new HashSet<String>();
	public static void main(String[] args) {
		StringPermutation sp = new StringPermutation();
		String str = "test";
		sp.printPermutn(str, "");
//		for (String s:sp.set){
//			System.out.println(s);
//		}

	}

	 void printPermutn(String str, String ans) {


		// If string is empty
		if (str.length() == 0) {
			System.out.println(ans);
			set.add(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String ros = str.substring(0, i) + str.substring(i + 1);

			// Recurvise call
			printPermutn(ros, ans + ch);
		}

	}

}
