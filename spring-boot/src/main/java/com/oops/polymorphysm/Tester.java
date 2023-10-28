package com.oops.polymorphysm;

//import java.util.Date;

public class Tester {

	public static void main(String[] args) {

		Shape parent = new Shape();
		parent.draw();

		Square child = new Square();
		child.draw();

		// Date dateRef = new Date();
		parent = null;
		// child = parent;

		// parent.draw();

	}

}
