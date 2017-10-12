import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Decryption {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		char decrypt;
		int reader;
		boolean loopCheck = false;
		try {
			FileInputStream input = new FileInputStream("IOTestEncrypt.dat");
			DataInputStream inputFile = new DataInputStream(input);

			FileOutputStream output = new FileOutputStream("IOTestDecrypt.dat");
			DataOutputStream outputFile = new DataOutputStream(output);
				while (!loopCheck) {
				decrypt = inputFile.readChar();
				reader = decrypt - 10;
				outputFile.writeInt(reader);
				System.out.println(reader);
				}
			inputFile.close();
			outputFile.close();
		}catch(

	EOFException e)
	{
		loopCheck = true;

	}
	}
}
