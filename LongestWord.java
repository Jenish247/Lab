/*
 * Java program to find the longest word in a text file.
 */

package com.labTest2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LongestWord {

	public static void main(String[] args) throws FileNotFoundException {
		String longestWord="";
		String current;
		Scanner sc=new Scanner(new File("D:\\test.txt"));
		while(sc.hasNext()) {
			current=sc.next();
			if(current.length()>longestWord.length()) {
				longestWord = current;
			}
		}
		System.out.println("Longest word in file is:"+longestWord);
	}

}
