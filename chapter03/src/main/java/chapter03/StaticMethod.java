package chapter03;

public class StaticMethod {
	int n;
	static int m;
	
	void f1() {
		n = 10;
	}
	
	void f2() {
		StaticMethod.m = 10;
		// 같은 클래스의 클래스(static) 변수 접근에서는 클래스 이름 생략 가능 
		m = 20;
	}
	
	void f4() {
		StaticMethod.s1();
		// 같은 클래스의 클래스(static) 메서드 접근에서는 클래스 이름 생략 가능
		s1();
	}
	
	static void s1() {
		// Error: static method에서는 instance 변수에 접근이 불가
		// n = 10;
	}
	
	static void s2() {
		// Error: static method에서는 instanc 메서드 접근이 불가
		//f1();
	}
	
	static void s3() {
		StaticMethod.m = 10;
		// 같은 클래스의 클래스(static) 변수 접근에서는 클래스 이름 생략 가능 
		m = 10;
	}
	
	static void s4() {
		StaticMethod.s1();
		// 같은 클래스의 클래스(static) 변수 접근에서는 클래스 이름 생략 가능 
		s1();
	}
}
