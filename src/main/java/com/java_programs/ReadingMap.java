package main.java.com.java_programs;

public class ReadingMap {

  public static void main(String[] args) throws ArithmeticException {
    try {
      throw new ArithmeticException();
    } catch (final Exception e) {
      System.out.println("There is an Exception in the code");
      e.printStackTrace();
    }
  }

}
