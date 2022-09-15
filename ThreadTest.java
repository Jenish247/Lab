/*
 * java program that implements a multi-thread application that has three
threads.generates random integer every 1 second and if the value is even,
second thread computes the square of the number and prints. If the value is odd, the third
thread will print the value of cube
 */
package labTest;

import java.util.Random;

class Squaree extends Thread{
	int n;
	Squaree(int x){
		this.n=x;
	}
	 public void run() {
		 int sqr = n * n;
		 System.out.println("Square of " + n + " = " + sqr );
	 }
}
class Cube extends Thread{
	int n;
	Cube(int x){
		this.n=x;
	}
	 public void run() {
		 int cube = n * n * n;
		 System.out.println("Cube of " + n + " = " + cube );
	 }
}
class Random1 extends Thread{
	 public void run() {
		 Random r=new Random(); 
		 for(int i=0;i<=5;i++) {
			int randomNumber=r.nextInt(100);
			System.out.println("Random number : " + randomNumber);
			if(randomNumber % 2==0) {
				 Squaree s = new Squaree(randomNumber);

				 s.start();
			}
			else {
				Cube c = new Cube(randomNumber);
				c.start();
				try {

					 Thread.sleep(1000);

					} catch (InterruptedException e) {

					 System.out.println(e);
					}
			}
		 }
	 }
}
public class ThreadTest extends Thread{
	public static void main(String[] args) {
		Random1 r=new Random1();
		r.start();
	}
}