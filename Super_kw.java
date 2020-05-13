//Java program to show the usage of 'super' keyword 
class Person
{  
	int id;  
	String name;  
	Person(int id,String name)
	{  
		this.id=id;  
		this.name=name;  
	}  
}

class Employee extends Person
{  
	float salary;  
	Employee(int id,String name,float salary)
	{  
		super(id,name);	//reusing parent constructor  
		this.salary=salary;  
	}  
	void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}  
}

class Super_kw
{  
	public static void main(String[] args)
	{  
		Employee e1=new Employee(45,"riya",23000f);  
		e1.display();  
	}
}   
