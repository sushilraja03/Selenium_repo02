package ControlStatements;

import java.util.Scanner;

public class ToLearnDecimalToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int dec = sc.nextInt();//14
		
		String bin =" ";
		while(dec>0)
		{
			int rem = dec%2;
			bin = rem+bin;
			dec=dec/2;
		}
		System.out.println(bin);
	}

}
