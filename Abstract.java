//Java program to show  Abstract class
abstract class Bird 
{
	// Abstract method 
	public abstract void birdSound();
	public void sleep() {
		System.out.println("Zzz");
	}
}

class Crow extends Bird 
{
	public void birdSound() 
	{
		System.out.println("Crow: ka ka ka ");
	}
}

class Abstract 
{
	public static void main(String[] args) 
	{
		Crow myobj = new Crow(); 
		myobj.birdSound();
		myobj.sleep();
	}
}
