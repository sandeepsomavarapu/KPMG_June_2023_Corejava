package pack1;

public class Test_AM {

	public void m1() {
		System.out.println("am from Test_AM class m1 method");
	}

	public static void main(String[] args) {
		Test_AM obj = new Test_AM();
		obj.m1();// same class
	}

}

class Hello extends Test_AM {

	public void m2() {
		m1();// same package sub class
	}

}

class Test2_Ex {

	public void m2() {
		Test_AM obj = new Test_AM();
		obj.m1();// same package non sub class
	}

}