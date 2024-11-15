package ControlStatements;

import java.util.Scanner;

public class DecimalToHexaDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int dec = sc.nextInt();
		String hex = " ";
		
		while(dec>0)
		{
			int rem=dec%16;
			if(rem>9)
			{
				hex=(char)(rem+55)+hex;
				dec = dec/16;
			}
			else
			{
				hex=rem+hex;
				dec=dec/16;
			}
		}
		System.out.println(hex);
	}

}
