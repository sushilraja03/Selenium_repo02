package ControlStatements;

public class Example8 {

	public static void main(String[] args) {
		
		int n = 90;
		
		for(int i=1;i<=n/2;i++)//this will get factor only for the number half of the number allocated as a number has half of its factor.
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
		System.out.println(n);
	}

}
