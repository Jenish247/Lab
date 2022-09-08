package com.labTest2;
public class Product {
	public double productCheck(double weight){
		if(weight<100f) {
			try {
				System.out.println("Product weight is below 100");
			}
			catch(Exception e) {
				System.out.println("Product is invalid"+e);
			}
		}
		else {
			System.out.println("Product is valid and weight is "+weight);
		}
		return weight;
		
	}
	public static void main(String[] args) {
		Product p=new Product();
		p.productCheck(150.4f);
		}
}
class MyException extends Exception{
	String str;
	
	public MyException(String str) {
		super();
		this.str = str;
	}
	public String toString() {
		return("MyException"+str);
	}
	
}
