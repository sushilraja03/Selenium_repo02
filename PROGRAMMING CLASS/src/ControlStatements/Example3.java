package ControlStatements;

public class Example3 {

	public static void main(String[] args) {
		int a=50,b=20,c=30;
		
		int small=a;
		
		if(b<small)
		{
			small = b;
		}
		if(c<small)
		{
			small=c;
		}
		System.out.println(small);
	}

}
