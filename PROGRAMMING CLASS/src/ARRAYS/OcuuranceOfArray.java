package ARRAYS;

public class OcuuranceOfArray {

	public static void main(String[] args) {
		
		int x[] = {10,20,10,-1,-2};
		boolean b[] = new boolean[x.length];
		for(int i=0;i<=x.length-1;i++)
		{
			if(b[i]==false)
			{
				int count = 1;
				for(int j=i+1;j<=x.length-1;j++)
				{
					if(x[i]==x[j])
					{
						count++;
						b[j]=true;
					}
				}
//				if(count==1)// to print unique element
//				if(count>1)// to print duplicate element	
//				System.out.println(x[i]); // to print element excluding duplicate or removing duplicates from array
				
				System.out.println(x[i] + " "+count);
			}
		}
		
		
	}

}
