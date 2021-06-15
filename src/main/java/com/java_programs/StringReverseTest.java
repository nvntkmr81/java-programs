package main.java.com.java_programs;

public class StringReverseTest {

  public static void main(String[] args) {
    final String ip = "Automation Engineer";
    final String op = "noitamotuA reenignE";
    final StringReverseTest st = new StringReverseTest();
    if (st.verifyOutput(ip, op))
      System.out.println("Test Passed");
    else
      System.out.println("Test Failed");
  }

  public boolean verifyOutput(String ip, String op) {
    String test = "";
    final String[] words = ip.split(" ");
    for (final String word : words) {
      for (int i = 0; i < word.length(); i++) {
        test = test + word.charAt(word.length() - 1 - i);
      }
      test = test + " ";
    }

    test = test.trim();
    System.out.println(test);
    return op.equals(test);
  }

}
