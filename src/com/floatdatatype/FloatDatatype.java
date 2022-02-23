package com.floatdatatype;

public class FloatDatatype {
	public static void main(String[] args) {
		float a=6.5f;
		double b=6.5d;
		if (a==b) {
			System.out.println("'a' and 'b' are equal .......");
		} else {
			System.out.println("'a' and 'b' are not equal .......");
		}

		a=6.1f;
		b=6.1d;
		if (a==b) {
			System.out.println("'a' and 'b' are equal .......");
		} else {
			System.out.println("'a' and 'b' are not equal .......");
		}
		a=6.0f;
		b=6.0d;
		if (a==b) {
			System.out.println("'a' and 'b' are equal .......");
		} else {
			System.out.println("'a' and 'b' are not equal .......");
		}
	}
}
