/*Java program to show the usage of 'super' keyword 
  to invoke the immediate parent constructor */
class Product
{  
	Product()
	{
		System.out.println("Product is created");
	}  
}

class Mobile extends Product
{  
	Mobile()
	{  
		super();			//constructor call  
		System.out.println("Mobile is a product");  
	}  
}

class Super3
{  
	public static void main(String args[])
	{  
		Mobile m = new Mobile();  
	}
}  
