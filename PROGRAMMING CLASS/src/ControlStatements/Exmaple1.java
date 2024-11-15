package ControlStatements;

import java.util.Scanner;

public class Exmaple1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value1");
		int n=sc.nextInt();
		if(n/2*2==0)
			//as it is interger value it doesnt take the values after decimal.
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
		
	}
}
