//Java program to demonstrate abstract class and methods

abstract class Animal 
{
	abstract void makeSound();
}

class Dog extends Animal 
{
	public void makeSound() 
	{
		System.out.println("Bow bow...");
	}
}

class Cat extends Animal 
{
	public void makeSound() 
	{
		System.out.println("Meow meow.. ");
	}
}

class Abstract1 
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		d1.makeSound();
		Cat c1 = new Cat();
		c1.makeSound();
	}
}

