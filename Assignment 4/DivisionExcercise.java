import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExcercise {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		try{

		int number1 = input.nextInt();
		int number2 = input.nextInt();

		System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
	
		}catch(ArithmeticException e){
			System.out.println("Please do not enter zero for the second number");
		}
	     catch(InputMismatchException ex){
		System.out.println("Please enter an integer for this number");
    	}
		System.out.println("test");
	}
}