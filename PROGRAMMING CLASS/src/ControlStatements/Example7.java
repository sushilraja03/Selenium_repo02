package ControlStatements;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		System.out.println("Enter The Number");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int num=1000;
		for(int i=1;i<=num;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
			
		}
	}

}
