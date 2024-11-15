package TekPyramidProgramsPractise;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str = "Level";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println("PalLindrome");
		}
		else
		{
			System.out.println("Not PalLindrome");
		}
				
	}

}
