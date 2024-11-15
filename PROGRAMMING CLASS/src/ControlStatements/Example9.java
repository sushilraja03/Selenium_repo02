package ControlStatements;

public class Example9 {

	public static void main(String[] args) {
		
		int n=16;
		int sum=0;
		
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		sum=sum+n;
		System.out.println(sum);
	}

}
