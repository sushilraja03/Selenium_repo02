package ControlStatements;

public class assgn2 
{
	public static void main(String[] args) {
		
		int a=50;
		int b=50;
		int c=50;
		
		if(a>b & a>c)
		{
			System.out.println("a is the biggest number");
		}
		if(b>a & b>a)
		{
			System.out.println("b is the biggest number");
		}
		if(c>b & c>a)
		{
			System.out.println("c is the biggest number");
		}
		if(a==b & b==c)
		{
			System.out.println("invalid number");
		}
	}
}
