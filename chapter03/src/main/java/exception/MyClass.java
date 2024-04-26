package exception;

import java.io.IOException;

public class MyClass {
	public void danger() throws IOException, MyException {
		System.out.println("some code...1");
		
		if(2 -2 == 0) {
			throw new MyException("error");
		}
		if(1 - 1 == 0) {
			throw new IOException();
		}
		
		System.out.println("some code...2");
		System.out.println("some code...3");
	}
}
