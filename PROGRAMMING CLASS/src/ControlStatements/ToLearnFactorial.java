package ControlStatements;

import java.util.Scanner;

public class ToLearnFactorial {

	public static void main(String[] args) {
		
		System.out.println("ENTER VALUE");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int fact=1;
		
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

}
