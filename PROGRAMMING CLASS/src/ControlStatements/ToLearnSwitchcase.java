package ControlStatements;

public class ToLearnSwitchcase {

	public static void main(String[] args) {
		
		int n=12;
		int num = n %2;
		switch(num)
		{
		case 0 : System.out.println("it is a even number");
		break;
		
		case 1 : System.out.println("it is an odd number");
		break;
		 
		default : System.out.println("invalid number");
		}
	}

}
