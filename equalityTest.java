/*
 * Java program to test the equality of two arrays.
 */
package com.labTest2;

import java.util.Arrays;

public class equalityTest {
    public static void main(String[] args)
    {
        int a[] = {10,20,30,40};
        int b[] = {20,30,60};
        boolean result = Arrays.equals(a, b);
        if (result == true) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}