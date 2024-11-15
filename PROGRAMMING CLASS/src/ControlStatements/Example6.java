package ControlStatements;

public class Example6 {

	public static void main(String[] args) {
		
		int n=100;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
				
			}
		}
		System.out.println("SUM OF ODD NUMBERS: "+sum);
		
	}

}
