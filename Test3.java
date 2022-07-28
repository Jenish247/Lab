/*
 * Java program to display the pattern like right angle triangle with a number
 */
import java.util.*;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		System.out.print("Input number of rows:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

}
