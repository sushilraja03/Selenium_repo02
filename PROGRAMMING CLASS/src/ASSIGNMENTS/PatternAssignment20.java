package ASSIGNMENTS;

public class PatternAssignment20 {

	public static void main(String[] args) {
		
		int n =9;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
