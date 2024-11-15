package ControlStatements;

import java.util.Scanner;

public class ToLearnNeon {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER VALUE");
		int n=sc.nextInt();
		
		isNeon(n);
	}
	public static void isNeon(int n)
	{
		int sq=n*n;// sq=81
		int sum=0;
		
		while(sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq/=10;
		}
		if(sum==n)
		{
			System.out.println("NEON NUMBER");
		}
		else
		{
			System.out.println("NOT A NEON NUMBER");
		}
	}

}
