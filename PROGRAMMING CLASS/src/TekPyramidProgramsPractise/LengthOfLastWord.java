package TekPyramidProgramsPractise;

public class LengthOfLastWord {

	public static void main(String[] args) {

		String str = " fly to the moon ";
		System.out.println(lengthOfLastWord(str));
		

	}

	static int lengthOfLastWord(String s) {
		
		int count=0;
		String str=s.trim();
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
			else
			{
				break;
			}
		}
		return count;
	}
}