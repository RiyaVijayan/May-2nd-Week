//Java program to demonstrate aggregation

public class Agr_2
{  
	int id;  
	String name;  
	Address address;		//aggregation  

	public Agr_2(int id, String name,Address address) 
	{  
		this.id = id;  
		this.name = name;  
		this.address=address;  
	}  

	void display()
	{  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
	}  

	public static void main(String[] args) 
	{  
		Address address1=new Address("Bangluru","Karnataka","India");  
		Address address2=new Address("Kollam","Kerala","India");  

		Agr_2 a1=new Agr_2(45,"Harisha",address1);  
		Agr_2 a2=new Agr_2(46,"Riya",address2);  

		a1.display();  
		a2.display();  

	}  
    }  
