//Java program to show the method overriding with covariant returntype

class A					//parent class
{  
	A get()
	{
		return this;
	}  
}  

class Covariant_rt extends A		//child class
{  
	Covariant_rt get()			//overriding of method get()
	{
		return this;
	}  
	void message()
	{
		System.out.println("welcome to covariant return type");
	}  

	public static void main(String args[])
	{  
		new Covariant_rt().get().message();  
	}  
}  
