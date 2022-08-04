/*
 * Java program to cyclically rotate a given array clockwise by one
 */

package com.labTest2;

import java.util.Arrays;

public class rotateArray {
	static int[] a= {10,20,30,40,50,60};
	static void rotated_Array() {
		int b = a[a.length-1],i;
		for(i=a.length-1;i>0;i--)
			a[i]=a[i-1];
		a[0]=b;
	}
	public static void main(String[] args) {
		System.out.println("Sample Array:"+Arrays.toString(a));
		rotated_Array();
		System.out.println("Rotated Array:"+Arrays.toString(a));	
	}

}
