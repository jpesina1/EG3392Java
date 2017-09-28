import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidNumbers {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean loopCheck = true;

		do{

			System.out.println("Enter a positive integer:");
			
			try {
				int user = keyboard.nextInt();
				if (user <= 0)
					throw new InputMismatchException();
				
				loopCheck = false;
				System.out.println("Your number is " + user);

			} catch (InputMismatchException e) {

				System.out.println("Try Again. (Incorrect input: A positive integer is required))");
				
				
			} catch (Exception e) {
				
				System.out.println("Another Exception occurred");
				
			}
			
		}while(loopCheck);

		System.out.println("End Loop");
	}
}
