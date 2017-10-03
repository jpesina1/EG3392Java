import java.io.*;
import java.util.Scanner;

public class BinarySum {
	public static void main(String[] args) throws IOException{
	int user = 0;
	int sum = 0;
	boolean endOfFile = false;
	Scanner keyboard = new Scanner(System.in);
	FileOutputStream output = new FileOutputStream("IOTest.dat");
	DataOutputStream outputFile = new DataOutputStream(output);  
	
	FileInputStream input = new FileInputStream("IOTest.dat");
	DataInputStream inputFile = new DataInputStream(input);
	
	
	System.out.println("Enter numbers to be added. Enter -1 to end");
	
	while (user != -1) {

		user = keyboard.nextInt();
		if(user == -1)
			break;
		else
		outputFile.writeInt(user);

	}
	outputFile.close();
	
	
	while(!endOfFile ){
		try {
			sum += inputFile.readInt();
		} catch (EOFException e) {
			endOfFile = true;
		}
		
	}
	System.out.println(sum);
	input.close();
	
	
	System.out.println("Program complete.");
	
	
	}
}
	
