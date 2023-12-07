package assignment3;

public class FindFibonacci {

	public static void main(String[] args) {

     // 0 1 1 2 3 5 8 13 21 34 

		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		
		
		System.out.println(n1);
		System.out.println(n2);
		
		for ( int i = 3; i<=10; i = i+1) {
		
		
		sum = n1 + n2;
		n1 = n2;
		n2 = sum;
		
		
		System.out.println(sum);}
		
		
		}//end of main

}//end of class
