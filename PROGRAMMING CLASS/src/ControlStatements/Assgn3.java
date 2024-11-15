package ControlStatements;

import java.util.Scanner;

public class Assgn3 {

	public static void main(String[] args) {
		
		System.out.println("ENTER VALUE");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("PERFECT NUMNBER");
		}
		else
		{
			System.out.println("NOT PERFECT");
		}
	}

}
