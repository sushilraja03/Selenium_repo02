package ControlStatements;

import java.util.Scanner;

public class ToLearnEvenOrOddUsingReturnTypeBoolean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		int n = sc.nextInt();
		boolean result = isEven(n);
		if(result==true)
		{
			System.out.println("It is an Even Number");
		}
		else
		{
			System.out.println("It is an odd Number");
		}
		
	}

	 static boolean isEven(int n) {
		
		 if(n%2==0)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		 
	}

}
