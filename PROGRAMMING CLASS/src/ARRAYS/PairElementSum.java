package ARRAYS;

public class PairElementSum {

	public static void main(String[] args) {
		
		
		int x[] = {5,2,3,0,4,1,6};
		for(int i=0;i<=x.length-1;i++)
		{
			int count =1;
			for(int j=i+1;i<=x.length;j++)
			{
				
				if(x[i]+x[j]==x.length)
				{
					count++;
				}
			}
			System.out.println(x[i]+" "+count);
		}
		
		
	}

}
