import java.io.*;

public class Encryption {

	public static void main(String[] args) throws IOException {

		int reader;
		char encrypter;
		boolean loopCheck = false;
		try {
			FileInputStream input = new FileInputStream("IOTest.dat");
			DataInputStream inputFile = new DataInputStream(input);

			FileOutputStream output = new FileOutputStream("IOTestEncrypt.dat");
			DataOutputStream outputFile = new DataOutputStream(output);
					
				while (!loopCheck) {
					reader = inputFile.readInt() + 10;	
					encrypter = (char)reader;
					outputFile.writeChar(encrypter);
					System.out.println(encrypter);
				}
				inputFile.close();
				outputFile.close();
		} catch (EOFException e) {
			loopCheck = true;
			
		} finally {
			System.out.println("Finally complete");
		}
		System.out.println("Loop Ends");
	}
}
