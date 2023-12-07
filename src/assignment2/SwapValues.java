package assignment2;

public class SwapValues {

	public static void main(String[] args) {
		int x=25;
		int y=35;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x);
		System.out.println(y);

	}

}
