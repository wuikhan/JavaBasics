package seleniumPackage;

import java.io.IOException;

public class Day13_BrokenLinks extends Utilities{

	public static void main(String[] args) throws IOException {
		openBrowser("firefox", "http://qa.ibextechnologies.us/dealership/node/78"); // BMW
		verifyLinks();
		
	}

}
