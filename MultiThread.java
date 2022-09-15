/*
 * java program for creating, initializing, and staring two Thread objects from your
class. The threads will execute concurrently and display "Java is hot,
aromatic and invigorating" to the console window
 */
package com.threads;
class MultiThreading extends Thread{
	static String message [ ] = {"Java", "is", "hot", "aromatic","and", "invigorating."};
	public MultiThreading (String id) {
		super (id);
	}
	public void run () {
		String name = getName ( );
		for (int i=0;i<message.length; ++i ) {
			randomWait ( );
			System.out.println (name + message[i] );
		}
	}
	void randomWait() {
		try{
			sleep ((long)(1000*Math.random ()));
		}
			catch (InterruptedException x ) {
				System.out.println ("Interrupted!");
			}
		}
}
public class MultiThread {

	public static void main(String[] args) {
		MultiThreading m1=new MultiThreading("Thread1:");
		MultiThreading m2=new MultiThreading("Thread2:");
		m1.start();
		m2.start();
		boolean m1IsAlive = true;
		boolean m2IsAlive = true ;
		do {
			if (m1IsAlive && !m1.isAlive()) {
				m1IsAlive = false;
				System.out.println ("Thread1 is dead.");
			}		
			if (m2IsAlive && ! m2.isAlive()) {
				m2IsAlive = false;
				System.out.println ("Thread 2 is dead.");
			}
		}
		while (m1IsAlive || m2IsAlive);
	}
}
	
