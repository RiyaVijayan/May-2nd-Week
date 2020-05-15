//Java program to demonstrate interface extension

interface Sports 
{
	public void HomeTeam(String name);
	public void VisitingTeam(String name);
}


interface Football extends Sports 
{
	public void homeTeamScored(int points);
	public void visitingTeamScored(int points);
}
class Mysport implements Football
{
	public void HomeTeam(String name)
	{
		System.out.println("Home team  : " + name);
	}
	public void VisitingTeam(String name)
	{
		System.out.println("Visiting team  : " + name);
	}
	public void homeTeamScored(int points)
	{
		System.out.println("Home team score  : " + points);
	}
	public void visitingTeamScored(int points)
	{
		System.out.println("Visiting team score  : " + points);
	}

}

class Interface2
{
	public static void main(String args[])
	{
		Football f =new Mysport();
		f.HomeTeam("Kerala Blasters FC ");
		f.VisitingTeam("FC Pune City " );
		f.homeTeamScored(5);
		f.visitingTeamScored(3);
	}
}

 


