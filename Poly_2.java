//Java program to show the runtime polymorphism with multilevel inheritance

class Animali
{  
	void eat()
	{
		System.out.println("eating...");
	}  
}

class Dog extends Animal
{  
	void eat()
	{
		System.out.println("eating bone...");
	}
}

class Cat extends Animal
{  
	void eat()
	{
		System.out.println("eating fish...");
	}  
}  

class Lion extends Animal
{  
	void eat()
	{
		System.out.println("eating meat...");
	}  
}  
class Poly_2
{  
	public static void main(String[] args)
	{  
		Animal a;  
		a=new Dog();  
		a.eat();  
		a=new Cat();  
		a.eat();  
		a=new Lion();  
		a.eat();  
	}
} 
