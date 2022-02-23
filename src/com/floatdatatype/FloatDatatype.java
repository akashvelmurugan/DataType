package com.floatdatatype;

public class FloatDatatype {
	public static void main(String[] args) {
		
		//binarydigit 110.1
		float a=6.5f;
		double b=6.5d;
		if (a==b) {
			System.out.println("'a' and 'b' are equal .......");
		} else {
			System.out.println("'a' and 'b' are not equal .......");
		}
		//binarydigit 110.0001100110011001101
		a=6.1f;
		b=6.1d;
		if (a==b) {
			System.out.println("'a' and 'b' are equal .......");
		} else {
			System.out.println("'a' and 'b' are not equal .......");
		}
		//binarydigit 110
		a=6.0f;
		b=6.0d;
		if (a==b) {
			System.out.println("'a' and 'b' are equal .......");
		} else {
			System.out.println("'a' and 'b' are not equal .......");
		}
	}
}
