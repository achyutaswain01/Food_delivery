package com.achyuta.food_delivery;

public class Order
{
       private Customer customer;
       private FoodItems foodItems;
       private int quantity;
	   public Order(Customer customer, FoodItems foodItems, int quantity) {
		super();
		this.customer = customer;
		this.foodItems = foodItems;
		this.quantity = quantity;
	   }
	   public Customer getCustomer() {
		   return customer;
	   }
	   public FoodItems getFoodItems() {
		   return foodItems;
	   }
	   public int getQuantity() {
		   return quantity;
	   }
	   public double calculate()
	   {
		   return foodItems.getPrice()*quantity;
	   }
       
       public String toString()
       {
    	   return "Customer Details: \n--------------------------------\n"+this.customer+"\nFood Details :\n-----------------------------\n"+this.foodItems+"\nQuantity : "+this.quantity+"\n Total Amount : "+calculate()+"";
       }
}
