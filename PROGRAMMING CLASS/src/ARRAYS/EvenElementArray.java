package ARRAYS;

public class EvenElementArray {

	public static void main(String[] args) {
		
		int x[]= {5,10,8,2};
		int count=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]%2==0)
				count++;
		}
		System.out.println("no of even number is "+count);
	}

}
