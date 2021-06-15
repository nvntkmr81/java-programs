package main.java.com.java_programs;

public class StringValue {

	public static void main(String[] args) {
		
		System.out.println(stringValue("aA"));
	}

	/**
	 * Method to return the value of a string where a,b,c... is 1,2,3... and A,B,C... is 27,28,29...
	 * @param s : input string
	 * @return value of the string
	 */
	
	static int stringValue(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i)))
				result += s.charAt(i) - 'A' + 27;
			else result += s.charAt(i) - 'a' + 1;
		}
		return result;
	}

}
