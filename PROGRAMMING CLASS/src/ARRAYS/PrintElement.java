package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class PrintElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		int x[]= new int[size];
		System.out.println("enter "+size+" Array elements");
		
		for(int i=0;i<=x.length-1;i++)
		{
			x[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(x));
//		for(int i=0;i<=x.length-1;i++)
//		{
////			System.out.print(x[i] + " ");
//			
//		}
		
	}

}
