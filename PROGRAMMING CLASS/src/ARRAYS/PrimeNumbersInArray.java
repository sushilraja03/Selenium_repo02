package ARRAYS;

public class PrimeNumbersInArray {

	public static void main(String[] args) {
		
		int x[] = {5,4,8,7,15,13};
		for(int i=0;i<=x.length-1;i++)
		{
			boolean res=isprime(x[i]);
			if(res==true)
				System.out.println(x[i]);
		}
		
		
	}

	 static boolean isprime(int n) {
		 
		 
		 int count=0;
		 for(int i=1;i<=n;i++)
		 {
			 if(n%i==0)
				count++; 
		 }
		 if(count==2)
			 return true;
		 else
			 return false;
		 
		
	}

}
