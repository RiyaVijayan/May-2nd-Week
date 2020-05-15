//Java program to show the interface class

interface Animal 
{
   public void eat();
   public void travel();
}

public class Interface implements Animal 
{

   public void eat() 
	{
    	System.out.println("Mammal eats");
   	}

   public void travel() 
	{
      	System.out.println("Mammal travels");
   	}	 

   public int noOfLegs() 
	{
      	return 0;
   	}

   public static void main(String args[]) 
	{
      		Interface i = new Interface();
      		i.eat();
      		i.travel();
   	}
} 
