//Java Program to show the simple inheritence
class Calculation 
{
int z;

void addition(int x, int y) 
{
z = x + y;
System.out.println("The sum of the given numbers:"+z);
}
void subtraction(int x, int y) 
{
z = x - y;
System.out.println("The difference between the given numbers:"+z);
}
}

public class simple_inh extends Calculation 
{
public void multiplication(int x, int y) 
{
z = x * y;
System.out.println("The product of the given numbers:"+z);
}
	
public static void main(String args[]) 
{
int a = 20, b = 10;
simple_inh s = new simple_inh();
s.addition(a, b);
s.subtraction(a, b);
s.multiplication(a, b);
}
}
