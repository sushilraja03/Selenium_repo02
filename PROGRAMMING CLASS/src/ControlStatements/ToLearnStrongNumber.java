package ControlStatements;

import java.util.Scanner;

public class ToLearnStrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER VALUE");
		int n=sc.nextInt();//145
		isStrong(n);
	}

	public static void isStrong(int n) {
		
		 int temp=n;
		 int sum=0;
		 
		 while(n>0)//145
		 {
			 
			int rem=n%10;
			int fact=factorial(rem);
			sum=sum+fact;
			n/=10;
		 }
		 if(sum==temp)
		 {
			 System.out.println("Strong number");
		 }
		 else
		 {
			 System.out.println("Not Strong");
		 }
		 
	}

	public static int factorial(int n) {
		 
		 int fact=1;
		 
		 for(int i=n;i>=1;i--)
		 {
			 fact=fact*i;
		 }
		return fact;
		 
		 
	}

}
