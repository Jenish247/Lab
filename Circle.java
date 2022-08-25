package com.LabTest;

public class Circle {
	private static int count;  
	float center,radius;
	public Circle(float c,float r) {
		this.center=c;
		this.radius=r;
		count++;
	}
	Circle(){
		System.out.println("this a default constructor");  
		count++;
	}
void display() {
	System.out.println("Center:"+center+" "+"radius:"+radius);
}
	public static void main(String[] args) {
		Circle c1=new Circle(12.4f,23.7f);
		Circle c2=new Circle(22.4f,24.9f);
		c1.display();
		c2.display();
		Circle c3=new Circle();
		System.out.print("Total Number of Instance: " + Circle.count); 
		
	}

}
