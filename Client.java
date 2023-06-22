package pack2;

import pack1.Test_AM;

public class Client extends Test_AM {

	public static void main(String[] args) {
		Client cl = new Client();
		cl.m1();// different package subclass
	}

}

class CurrentEx {
	public void display() {
		Test_AM obj = new Test_AM();
		obj.m1();//different package non-subclass
	}

}