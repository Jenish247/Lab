/*
 * Java program to cyclically rotate a given array clockwise by one
 */

package com.labTest2;

public class rotateArray {
	   public static void main(String[] args) {
	      int[] a = {10,20,30,40,50};
	      int n = a.length;
	      int last, i;
	      System.out.print("The original array is: ");
	      for (i = 0; i < n; ++i)
	      System.out.print(a[i] + " ");
	      last = a[n-1];
	      for (i = n-1; i > 0; i--)
	      a[i] = a[i-1];
	      a[0] = last;
	      System.out.print("\nThe rotated Array is: ");
	      for (i = 0; i < n; ++i)
	      System.out.print(a[i] + " ");
	   }
}
	  