package classOne;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		/*
		 * Write a program that swaps the values of two variables without using third variable
		 * 
		 */		
		int a = 10;
		int b = 30;
		
		//swap two numbers without using temp variable
		System.out.println(" Before swapping: " + " a: " + a + " & b: " + b);
		a = a + b; //10+20 = 40
		b = a - b; //40-30 = 10
		a = a - b; //40-10 = 30
		System.out.println(" After swapping: " + " a: " + a + " & b: " + b);
		

	}

}
