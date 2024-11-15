package ASSIGNMENTS;

public class PrimeNumberAssgn 
{
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			boolean res=isPrime(i);
			
			if(res)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("SUM OF PRIME NUMBER FROM 1 TO 100 : "+ sum);
		
		
	}

	public static boolean isPrime(int n) {
		
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		return count==2;
	}
}
