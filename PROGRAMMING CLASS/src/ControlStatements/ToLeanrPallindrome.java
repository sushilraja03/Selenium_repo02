package ControlStatements;

import java.util.Scanner;

public class ToLeanrPallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER VALUE");
		int n = sc.nextInt();
		
		isPallindrome(n);
	}

	  static void isPallindrome(int n) {
		 
		 int rev=0;
		 int temp=n;
		 while(n>0)
		 {
			 int rem=n%10;
			 rev=rev*10+rem;
			 n/=10;
		 }
		 if(rev==temp)
		 {
			 System.out.println("PALLINDORME VALUE");
		 }
		 else
		 {
			 System.out.println("NOT PALLINDROME");
		 }
	}

}
