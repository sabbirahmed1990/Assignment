package assignment3;

public class FindFibonacci1 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int sum = 0;
		
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		
		for ( int i = 2; i < 20; i = i+1) {
			
			sum = a+b;
		    a = b;
		    b = sum;
		    
		    System.out.print(sum+" ");
		}
		

	}

}
