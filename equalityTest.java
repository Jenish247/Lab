/*
 * Java program to test the equality of two arrays.
 */
package com.labTest2;

import java.util.Arrays;

public class equalityTest {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int[] b= {10,20,30,40,50};
		int[] c= {10,20,30,40,60};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
	}

}
