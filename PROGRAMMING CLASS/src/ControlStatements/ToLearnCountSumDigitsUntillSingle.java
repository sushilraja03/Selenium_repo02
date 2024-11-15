package ControlStatements;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ToLearnCountSumDigitsUntillSingle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER VALUE");
		int n = sc.nextInt();
		sumOfDigit(n);
		
		
		
	}

	public static void sumOfDigit(int n) {
		
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				int rem=n%10;
				sum=sum+rem;
				n=n/10;
			}
			n=sum;
		}
		System.out.println(n);
	}
	

}
