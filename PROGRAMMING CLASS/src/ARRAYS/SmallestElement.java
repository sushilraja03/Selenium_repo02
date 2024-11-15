package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int size = sc.nextInt();
		int x[]=new int[size];
		System.out.println("Enter "+size+" array elemnets");
		
		for(int i=0;i<=x.length-1;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(x));
		
		int small = x[0];
		for(int i=1;i<=x.length-1;i++)
		{
			if(small>x[i])
			{
				small=x[i];
			}
		}
		System.out.println(small);
		
	}

}
