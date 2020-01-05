
public class SwapChars {

	public static void main(String[] args) {
		// given a String, swap and return the last 2 characters of the string
		//use TDD
		
	}

	public static String swap2(String str) {
		
		int strLength = str.length();  
		if(strLength < 2) {  //catches 0 and 1
			return str;
		}
		char lastCharacter = str.charAt(strLength -1); // -1 bc it has a length != index...index starts at zero 
		char secondToLastCharacter = str.charAt(strLength - 2);
		
		return "" + lastCharacter + secondToLastCharacter;  // quotes let it know we want a String
	}

}
