package ControlStatements;

import java.util.Scanner;

public class ToLearnDecimalToOctal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int dec=sc.nextInt();
		
		String oct = " ";
		
		while(dec>0)
		{
			int rem = dec%8;
			oct=rem+oct;
			dec=dec/8;
		}
		System.out.println(oct);
	}

}
