/*
 * Java program to find transpose of a given matrix
 */
package com.labTest2;
import java.util.*;

public class Transpose {
	public static void main(String[] args) {
		int i,j;
		System.out.print("Enter total number of rows and column:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		System.out.print("Enter matrix");
		for(i = 0;i<row;i++) {
			for(j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
				System.out.print("");
			}
		}
		System.out.println("Normal Matrix:");
		for(i = 0; i < row; i++) {
      	    for(j = 0; j < col; j++) {
          	System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
 	System.out.println("The above matrix after Transpose is ");
  	for(i = 0; i < col; i++) {
      	    for(j = 0; j < row; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}