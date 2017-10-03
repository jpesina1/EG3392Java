import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:/Users/Jacob/Desktop/Tester.txt");
		PrintWriter p = new PrintWriter(f);
		Scanner keyboard = new Scanner(System.in);
		Scanner input = new Scanner(f);
		
		int user = 0;
		int sum = 0;
		
		System.out.println("Enter numbers to be added. Enter -1 to end");
		
		try{
		while (user != -1) {

			user = keyboard.nextInt();
			if(user == -1)
				break;
			else
			p.print(user + " ");

		}
		p.close();

		while (input.hasNext()) {
			sum += input.nextInt();
		}
		System.out.println("The sum of all the numbers entered is " + sum);
		input.close();
	
		}
		catch(InputMismatchException ex){
			System.out.println("Please enter only integers");	
		}
		catch(Exception ex){
		
		System.out.println("An error occurred ");
	}
		System.out.println("Program has finished");
		
	}
}
