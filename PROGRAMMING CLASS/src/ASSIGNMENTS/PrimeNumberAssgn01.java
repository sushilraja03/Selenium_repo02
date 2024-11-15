package ASSIGNMENTS;

public class PrimeNumberAssgn01 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=50;i++)
		{
			boolean res=isPrime(i);
			if(res)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count of prime numbers from 1 to 50 : "+count);
		
		
		
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
