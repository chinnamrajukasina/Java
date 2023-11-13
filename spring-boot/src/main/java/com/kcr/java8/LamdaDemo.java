package com.kcr.java8;

@FunctionalInterface
interface A {
	void show();
}

class B implements A {
	public void show() {
		System.out.println("Hello World");
	}

}

public class LamdaDemo {

	public static void main(String[] args) {
A obj = new B();
obj.show();


A lam =()->System.out.println("Hello World using Lamda");
lam.show();
	}

}
