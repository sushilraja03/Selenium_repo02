package TekPyramidProgramsPractise;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		
		String str = "The sky is Blue";
		System.out.println(reverseWord(str));
		
	}

	public static String reverseWord(String s) {
		
		String[] words = s.split(" +");
		StringBuilder sb = new StringBuilder();
		for(int i=words.length-1;i>=0;i--)
		{
			sb.append(words[i]);
			sb.append(" ");
		}
		
		return sb.toString().trim();
	}

}
