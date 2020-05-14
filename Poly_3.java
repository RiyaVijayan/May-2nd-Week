/*Java program to show the runtime polymorphism 
  can't be achieve with datamembers */

class Flower
{  
	int ageDays=3;  
}
  
class Poly_3 extends Flower
{  
	int ageDays=7;  

	public static void main(String args[])
	{  
		Flower obj = new Poly_3();  
		System.out.println(obj.ageDays);	//shows parent data  
	}
}  
