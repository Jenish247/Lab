package com.labTest2;

import java.util.stream.Stream;

class FruitBasket{
	String fruitName;
	int weightInKgs;
	int pricePerKg;
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getWeightInKgs() {
		return weightInKgs;
	}
	public void setWeightInKgs(int weightInKgs) {
		this.weightInKgs = weightInKgs;
	}
	public int getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(int pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	
}
class FruitBasketUtility
{
	String fruitName;
	int weightInKgs;
	int PricePerKgs;
	private FruitBasket tbObj;
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getWeightInKgs() {
		return weightInKgs;
	}
	public void setWeightInKgs(int weightInKgs) {
		this.weightInKgs = weightInKgs;
	}
	public int getPricePerKgs() {
		return PricePerKgs;
	}
	public void setPricePerKgs(int pricePerKgs) {
		PricePerKgs = pricePerKgs;
	}
	public void addToBasket(FruitBasket tbObj) {
		this.tbObj=tbObj;
	}
	public int calculateBill(Stream<FruitBasket> fruitBasketStream)
	{
		return PricePerKgs;
	}

	
}
public class Customer {

	public static void main(String[] args) {
		FruitBasket fb=new FruitBasket();
		fb.setFruitName("Apple");
		System.out.println("fruit name is :"+fb.getFruitName());
		
		fb.setPricePerKg(150);
		System.out.println("price of fruit per kg is:"+fb.getPricePerKg());
		
		fb.setWeightInKgs(5);
		System.out.println("weight of fruit in kg is :"+fb.getWeightInKgs());
		
		
		FruitBasketUtility fbu=new FruitBasketUtility();
		fbu.setFruitName("Grapes");
		System.out.println("fruit name is:"+fbu.getFruitName());
		
		fbu.setPricePerKgs(170);
		System.out.println("Price of fruit per kg is:"+fbu.getPricePerKgs());
		
		fbu.setWeightInKgs(1);
		System.out.println("weight of fruit in kg is:"+fbu.getWeightInKgs());

	}

}
