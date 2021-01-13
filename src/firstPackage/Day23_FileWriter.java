package firstPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Day23_FileWriter {

	public static void main(String[] args) throws IOException {
		// create a file object
		File file = new File("/Users/codegator/Desktop/sample.txt"); // the location of the file
		// We will create an object of FileWriter class and going to pass the file
		// object as a parameter
		FileWriter fWrite = new FileWriter(file);
		// write inside the file
		fWrite.write("Updated the file");
		fWrite.close();
		System.out.println("File Writing complete");
		
		long time = System.currentTimeMillis();
		
		File newFile = new File("/Users/codegator/Desktop/sample-"+time+".txt");
		if(file.renameTo(newFile)) {
			System.out.println("File rename complete");
		} else {
			throw new IOException("The old file does not exsist");
		}
	}

}

