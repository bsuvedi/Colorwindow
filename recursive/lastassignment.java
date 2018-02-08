import java.util.Scanner;

//Name: Bijayraj Subedi
//Class: CS 196 001 Computer Programming II
// Assignment: Recursive assignment Question 1. - Recursive Multiplication
// Date: 6 May 2016




public class lastassignment {
	static int number1;
	static int number2;
	static int number3 = 0;
	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What is your first number?");
	number1 = keyboard.nextInt();
	
	System.out.println("What is your another number?");
	number2 = keyboard.nextInt();
	
	System.out.println("The Multiplication of those two number is equal to " +multiply(number1, number2));
	
	
	
	}
	


		
		

	

	private static int multiply(int x, int y) {
		if (y <= 0) {
			number3 = number3* 1;
		}
		else 
		{
			number3 = multiply(x, y-1 ) + x;
			
			
		}
		return number3;
	}
	}
	
