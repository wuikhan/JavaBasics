package firstPackage;

public class Day20 {

	public static void main(String[] args) {
		String mixCharacter = "HELLO, Today is monday 12345 !@# Waqas &^% 876 ";
		String noUpperCase = mixCharacter.replaceAll("[A-Z]", ""); // remove all the upper case characters
		System.out.println(noUpperCase);

		String noLowerCase = mixCharacter.replaceAll("[a-z]", "");// remove all the lower case characters
		System.out.println(noLowerCase);

		String noNumbers = mixCharacter.replaceAll("[0-9]", "");
		System.out.println(noNumbers);

		String specialCharacters = mixCharacter.replaceAll("[A-Za-z0-9]", ""); // it is going to ignore all the upper,
																				// lower and number
		System.out.println(specialCharacters);

		String onlyUpperCase = mixCharacter.replaceAll("[^A-Z]", "");
		System.out.println(onlyUpperCase);

		String lowerCase = mixCharacter.replaceAll("[^a-z]", "");
		System.out.println(lowerCase);

		char[] characters = lowerCase.toCharArray();
		System.out.println(characters.length);
		for (int i = 0; i < characters.length; i++) {
			System.out.println(characters[i]);
		}
		
		
		String setOfWords = "Java is fun we can build interesting applications";
		
		String[] afterSplit = setOfWords.split(" ");
		
		for(int i=0;i<afterSplit.length; i++) {
			System.out.println(afterSplit[i]);
		}
		
	}
}
