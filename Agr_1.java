class Operation
{  
	int square(int n)
	{  
		return n*n;  
	}  
}  

class Agr_1 
{  
	Operation op;//aggregation  
	double pi=3.14;  

	double area(int radius)
	{  
		op=new Operation();  
		int answer=op.square(radius);  
		return pi*answer;  
	}  



	public static void main(String args[])
	{  
		Agr_1 a=new Agr_1();  
		double result=a.area(5);  
		System.out.println("Area of circle with radius 5: " + result);  
	}  
} 
