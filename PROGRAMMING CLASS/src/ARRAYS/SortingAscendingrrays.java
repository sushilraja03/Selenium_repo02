package ARRAYS;

import java.util.Arrays;

public class SortingAscendingrrays {

	public static void main(String[] args) {
		
		int x[] = {40,30,10,50,20};
		for(int i=0;i<=x.length-1;i++)
		{
			for(int j=i+1;j<=x.length-1;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(x));
	}

}
