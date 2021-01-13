package firstPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day23_FileReader {

	public static void main(String[] args) throws IOException {
// File Reader

		// Create an object of a file class
		File file = new File("/Users/codegator/Desktop/sample.txt");
		// Create an object of File Reader class and pass the file argument in it
		try {
			FileReader fRead = new FileReader(file);
			
			int a = 0;

			while((a=fRead.read()) !=-1) { //78
//				System.out.println(a);
				System.out.print((char)a);
			}
			
			System.out.println(fRead.read());
			fRead.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(file.exists()) {
			file.delete();
			System.out.println("The file deleted successfully");
		} else {
			System.out.println("There is no file with that name");
		}

	}

}
