//Java program to demonstrate the instance initializer block 

class America
{  
	America()
	{  
		System.out.println("Parent class constructor invoked");  
	}  
}  

class instance_blk extends America
{  
	instance_blk()
	{  
		super();  
		System.out.println("child class constructor invoked");  
	}  

	instance_blk(int a)
	{  
		super();  
		System.out.println("child class parametrized constructor invoked "+a);  
	}  


	{
		System.out.println("instance initializer block is invoked");		//instance bloack
	}  

	public static void main(String args[])
	{  
		instance_blk b1=new instance_blk();
		System.out.println();  
		instance_blk b2=new instance_blk(10);  
	}  
}  
