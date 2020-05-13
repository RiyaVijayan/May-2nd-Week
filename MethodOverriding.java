//Java program to demonstrate the Method Overriding  

class Bank						//parent class
{  
	int getRateOfInterest()
	{
		return 0;
	} 
}  

class SBI extends Bank					//child class of Bank
{  
	int getRateOfInterest()
	{
		return 8;
	}  
}  

class ICICI extends Bank				//child class of Bank
{  
	int getRateOfInterest()
	{
		return 7;
	}  
}

class AXIS extends Bank					//child class of Bank overriding same method
{  
	int getRateOfInterest()
	{
		return 9;
	}  
}  


class MethodOverriding
{  
	public static void main(String args[])
	{  
		SBI s=new SBI();  
		ICICI i=new ICICI();  
		AXIS a=new AXIS();  
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
	}  
}
