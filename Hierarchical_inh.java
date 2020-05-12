//Java program to demonstrate Hierarchical Inheritance 

class Animal						//super class
{  
	void eat()
	{
		System.out.println("eating...");
	}  
}

class Dog extends Animal				//child of Animal class
{  
	void bark()
	{
		System.out.println("barking...");
	}  
}

class Cat extends Animal				//child of Animal class
{  
	void meow()
	{
		System.out.println("meowing...");
	}  
}  

class Hierarchical_inh
{  
	public static void main(String args[])
	{  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		//c.bark(); Error  
	}
}  
