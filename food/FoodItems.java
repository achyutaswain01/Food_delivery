package com.achyuta.food_delivery;

public class FoodItems 
{
  
	private String itemName;
	private double price;
	public FoodItems(String itemName, double price) {
		super();
		this.itemName = itemName;
		this.price = price;
	}
	
	public void setItemName(String itemName) 
	{
		if(itemName.trim().isBlank())
		{
			System.err.println("Please Enter Valid Name !!");
			System.exit(0);
		}
		else
		this.itemName = itemName;
	}

	public void setPrice(double price)
	{
		if(price<=0)
			
		{
			System.err.println("Price cannot be Negative !!!");
			System.exit(0);
		}
		else
		this.price = price;
	}

	public String getItemName() {
		return itemName;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Item Name : "+this.itemName+"\nItem Price : "+this.price+"";
	}

	
	
}
