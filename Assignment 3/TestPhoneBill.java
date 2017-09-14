import java.util.Scanner;

public class TestPhoneBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program will calculate your phone bill for you");
		System.out.println("What is your call rate?");
		double cRate = keyboard.nextDouble();
		System.out.println("What is your monthly rate?");
		double mRate = keyboard.nextDouble();
		System.out.println("How many minutes did you talk?");
		int minutes = keyboard.nextInt();
		System.out.println("Your monthly bill is :");

		PhoneBill p1 = new LongDistanceBill(cRate, mRate, minutes);
	}

}
