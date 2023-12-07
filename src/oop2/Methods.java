package oop2;

public class Methods {

   int a;
   int b;
   void add () {
	int sum;
	sum = a+b;
	System.out.println(sum);
   }
	
	void sub () {
	int sub;
	sub = a-b;
	System.out.println(sub);
	}
	
	void add ( int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}
	
	void add ( double a, double b, double c) {
		double sum = a+b+c;
		System.out.println(sum);
		
	}
	
	void malti (int a, int b) {
	int multi = a*b;
	System.out.println(multi);
		
	}
	
	void div (int a, int b) {
	int div =  a / b;
	System.out.println(div);
		
	}
	
	
	public static void main(String[] args) {
		//100/10    +10
		Methods m1 = new Methods ();
		
		m1.div(100, 10);
		
		
		
		
		
		
		
		
		
		
		

	}

}
