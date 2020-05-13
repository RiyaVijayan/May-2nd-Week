//Java program to demonstrate methodoverloading with type promotion
class MethodOverloading1
{  
	void sum(int a,long b)
	{
		System.out.println("int,long arg  method invoked");
	}

	void sum(long a,long b)
	{
		System.out.println("long,long arg method invoked");
	}  

	public static void main(String args[])
	{  
		MethodOverloading1 obj=new MethodOverloading1();  
		obj.sum(20,20);//Type promotion performed  
	}  
}  
