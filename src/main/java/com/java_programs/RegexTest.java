package main.java.com.java_programs;

public class RegexTest {
	public static void main(String[] args) {
		String str = "te3hsdw7 dfaker2SDF3 df833 0dffjf";
		String[] digits = str.split("\\D| ");
		for(String d:digits){
			System.out.print(d);
		}
	}

}
 