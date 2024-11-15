package ControlStatements;

public class Example2 
{
	public static void main(String[] args) {
		
		double bal=20000.0;
		
		double amt=10000.0;
		
		if(amt<bal)
		{
			System.out.println("withdraw successful");
			
			bal=bal-amt;
			System.out.println("balance : "+bal);
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
}
