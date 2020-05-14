//Java program to show the runtime polymorphism with upcasting

class Vehicle
{  
	void run()
	{
		System.out.println("running");
	}
}  

class Poly_1 extends Vehicle
{  
	void run()
	{
		System.out.println("running safely with 60km");
	}  

	public static void main(String args[])
	{  
		Vehicle v = new Poly_1();		//upcasting  
		v.run();  
	}  
}  
