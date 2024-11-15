package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int x[]= new int[size];
		System.out.println("Enter "+size+" Array elemnets");
		for(int i=0;i<=x.length-1;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(x));
		int big=x[0];
		for(int i=1;i<x.length-1;i++)
		{
			if(x[i]>big)
			{
				big=x[i];
			}
		}
		System.out.println("biggest number "+big);
		
	}

}
