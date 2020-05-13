/*Java program to show the usage of 'super' keyword 
  to refer the immediate parent instance variables */

class Father
{  
	int age = 54;  
}

class Son extends Father
{  
	int age = 23;

	void printAge()
	{  
		System.out.println("Age of son : "+ age);//prints age of Son class  
		System.out.println("Age of father : " + super.age);//prints age of Father class  
	}  
}

class Super1
{  
	public static void main(String args[])
	{  
		Son s = new Son();  
		s.printAge();  
	}
}  
