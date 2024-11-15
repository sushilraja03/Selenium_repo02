package ARRAYS;

public class PlaindromeArray {

	public static void main(String[] args) {
		
		int count=0;
		int x[] = {121,123,323,473,494};
		for(int i=0;i<=x.length-1;i++)
		{
			boolean res = ispal(x[i]);
			if(res==true)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

	 static boolean ispal(int n) {
		 
		 
		 int temp=n;
		 int rev=0;
		 for(int i=0;i<=n;i++)
		 {
			 while(n > 0)
			 {
				 
				 int rem=n%10;
				 rev=rev*10+rem;
				 n=n/10;
			 }
		 }
		 if(temp==rev)
			 return true;
		 else
			 return false;
	}

}
