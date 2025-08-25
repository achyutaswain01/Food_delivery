package com.achyuta.food_delivery;

import java.util.Scanner;

public class DeliveryApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name =sc.nextLine();
		if(name.trim().isBlank() ||name.equals(null))
		{
			System.err.print("Enter Valid Name !!!");
			System.exit(0);
		}
		System.out.print("Enter Phone Number :  ");
		String phone=sc.nextLine();
		if(phone.length()<10)
		{
			System.err.print("Enter Valid Phone Number !!!");
			System.exit(0);
		}
		System.out.print("Enter Street Name :");
		String street=sc.nextLine();
		if(street.trim().isBlank() ||street.equals(null))
		{
			System.err.print("Enter Valid Street Name !!!");
			System.exit(0);
		}
		
		System.out.print("Enter city Name :");
		String city=sc.nextLine();
		if(city.trim().isBlank() || city.equals(null))
		{
			System.err.print("Enter Valid City Name !!!");
			System.exit(0);
		}
		System.out.print("Enter ZIP CODE :");
		String zipCode=sc.nextLine();
		if(zipCode.trim().isBlank() ||zipCode.equals(null))
		{
			System.err.print("Enter Valid zipcode Name !!!");
			System.exit(0);
		}
		Customer cust = new Customer(name, phone, street, city, zipCode);
		
		
		System.out.print("Enter Item Name :");
		String itemName = sc.nextLine();
		if(itemName.trim().isBlank() ||itemName.equals(null))
		{
			System.err.print("Enter Valid Item Name !!!");
			System.exit(0);
		}
        System.out.print("Enter Price : ");
        double price = sc.nextDouble();
        if(price<=0)
        {
        	System.err.print("Price Cannot Be Negative !!!");
        	System.exit(0);
        }
        sc.nextLine();
        FoodItems items=new FoodItems(itemName, price);
        System.out.print("Enter Quantity :");
        int qty=sc.nextInt();
        if(qty<=0)
        {
        	System.err.println("Quantity must be One !!!");
        	System.exit(0);
        }
        sc.nextLine();
        Order order =new Order(cust, items, qty);
        System.out.print(order);
       
       
        
        
        
        
//        items.setPrice(-100);
//        System.out.println(items);
        sc.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
