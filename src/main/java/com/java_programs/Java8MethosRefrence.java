package main.java.com.java_programs;

import java.util.Arrays;
import java.util.List;

public class Java8MethosRefrence {
	public static void main(String[] args) {
		String[] arr = { "Test1", "Test2", "Test3" };
		List<String> array = Arrays.asList(arr);
		Java8MethosRefrence obj = new Java8MethosRefrence();
		MyInterface ref = obj::greeting;
		MyInterface2 ref2 = obj::greeting; // for overloaded methods the compiler decides from the referenced function Interface.
		ref.display();
		ref2.display("Navneet");
		array.forEach(System.out::println); // println method is called with
											// reference using "::"
		array.forEach(String::length);
	}

	void greeting() {
		System.out.println("Hello user");
	}

	void greeting(String name) {
		System.out.println("Hello " + name);
	}

	interface MyInterface2 {
		void display(String name);
	}

	interface MyInterface {
		void display();
	}

}
