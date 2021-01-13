package firstPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Day24_FileOutput {

	public static void main(String[] args) throws IOException {
//		File file = new File("/Users/codegator/Desktop/sample.txt");
//		FileWriter fWrite = new FileWriter(file);
//		fWrite.write("Updated the file");
//		fWrite.close();
		
		FileOutputStream fos = new FileOutputStream("/Users/codegator/Desktop/sample-fos.txt");
		String text = "Hello World";
		byte b[] = text.getBytes();
		fos.write(b);
		fos.close();
	}

}
