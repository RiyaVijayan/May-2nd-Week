//Java program showing the downcasting with instanccof operator

class House { }  

class Downcasting extends House 
{  
	static void method(House h) 
	{  
		if(h instanceof Downcasting)
		{  
			Downcasting d=(Downcasting)h; //downcasting  
			System.out.println("downcasting performed");  
		}  
	}  

	public static void main (String [] args) 
	{  
		House h = new Downcasting();  
		Downcasting.method(h);  
	}  

}  
