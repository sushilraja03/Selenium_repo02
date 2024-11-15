package ControlStatements;

public class Example4 
{
	public static void main(String[] args) {
		
		int i = 15;
		if(i%3==0 && i%5==0)
		{
			System.out.println("SANJU WEDS GEETA");
		}
		else if(i%5==0)
		{
			System.out.println("Geeta");
		}
		else if(i%3==0)
		{
			System.out.println("SANJU");
		}
		else
		{
			System.out.println("BREAKUP");
		}
	}
}
