package com.achyuta.food_delivery;

public class Customer
{
    private String customerName;
    private String phone;
    private Address address;
    
    public Customer(String customerName,String phone,String street,String city,String zipCode)
    {
    	this.customerName=customerName;
    	this.phone=phone;
    	this.address=new Address(street, city, zipCode);
    }
    
    public void setCustomerName(String customerName) 
    {
    	if(customerName.trim().isEmpty())
    	{
    		System.err.println("Enter Valid Name");
    	System.exit(0);
    	}
    	else
    		this.customerName = customerName;
		
	}

	public void setPhone(String phone) 
	{
		if(phone.length()<=10)
		{
			System.err.println("Please Enter Valid Pkone Number !!");
			System.exit(0);
		}
		else
		this.phone = phone;
	}

	public void setAddress(Address address) 
	{
		if(address.getStreet().trim().isBlank())
		{
			System.err.println("Enter Valid Name !!");
			System.exit(0);
		}
		if(address.getCity().trim().isBlank())
		{
			System.err.println("Enter Valid CityName!!");
			System.exit(0);
		}
		if(address.getZipCode().trim().isEmpty() || address.getZipCode().equals("0"))
		{
			System.err.println("Enter Valid ZIPCODE!!");
			System.exit(0);
		}
		this.address = address;
	}
	

	public String getCustomerName() {
		return customerName;
	}

	public String getPhone() {
		return phone;
	}

	public Address getAddress() {
		return address;
	}

	public String toString()
    {
    	return "Customer Name : "+this.customerName+"\nCustomer Phone Number : "+this.phone+"\nAddress Details : "+this.address+"";
    }
}
