package ControlStatements;

import java.util.Scanner;

public class ToLearnPrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE VALUE");
		int n = sc.nextInt();
		
		boolean res=isPrime(n);//7
//		if(res==true)
//		{
//			System.out.println("PRIME NUMBER");
//		}
//		else
//		{
//			System.out.println("NOT PRIME");
//		}
		if(res)//optional
		{
			System.out.println("PRIME NUMBER");
		}
		else
		{
			System.out.println("NOT PRIME");
		}
	}

	public static boolean isPrime(int n) {
		
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			count=count+1;
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
//		return count==2;//to eliminate 4 statements we can use this statement.
	}

}
