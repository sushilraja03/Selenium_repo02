package ControlStatements;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			boolean res=isPrime(i);
			
			if(res)
			{
				System.out.println(i);
			}
		}
		
	}

	public static boolean isPrime(int n) {
		
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		return count==2;
		
	}

}
