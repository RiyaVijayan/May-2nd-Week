//Java program to show the interface 

interface Draw
{  
	void draw();  
}  
//Implementation  
class Rectangle implements Draw
{  
	public void draw()
	{
		System.out.println("drawing rectangle");
	}  
}

class Circle implements Draw
{  
	public void draw()
	{
		System.out.println("drawing circle");
	}  
}  

class Interface1
{  
	public static void main(String args[])
	{  
		Draw d=new Circle();  
		d.draw();  
	}
}  
