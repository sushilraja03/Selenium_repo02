package ControlStatements;

import java.util.Scanner;

public class ToLearnSpyNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER VALUE");
		int n=sc.nextInt(); 
		isSpy(n);
	}

	 static void isSpy(int n) 
	 {
		 int sum=0;//9
		 int product=1;
		 int rcm=n%10;
		 while(n>0)
		 {
			 sum=sum+rcm;
			 product=product*rcm;
			 n=n/10;
		 }
		 if(sum==product)
		 {
			 System.out.println("spy");
		 }
		 else
		 {
			 System.out.println("not spy");
		 }
	}

}
