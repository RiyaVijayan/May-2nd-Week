//Java program demonstrating runtime polymorphism

class Birds
{  
	void sing()
	{
		System.out.println("Birds singing...");
	}  
}  

class Parrot extends Birds
{  
	void sing()
	{
		System.out.println("Parrot speaking...");
	}  
}

class Poly_4 extends Parrot
{  
	public static void main(String args[])
	{  
		Birds b = new Poly_4();  
		b.sing();  
	}
}  
