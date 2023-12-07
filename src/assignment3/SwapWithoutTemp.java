package assignment3;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		
		
		int x=10;
		int y=15;
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println(x);
		System.out.println(y);

	}

}
