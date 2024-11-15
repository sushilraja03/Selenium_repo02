package ControlStatements;

import java.util.Scanner;

public class ToLearnPower {

	public static void main(String[] args) {
		
		System.out.println("ENTER n VALUE");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("ENTER p VALUE");
		int p = sc.nextInt();
		int power=1;
		for(int i=1;i<=p;i++)
		{
			power=power*n;
		}
			System.out.println(power);
	}

}
