import java.util.*;

class CharactersCLITest {
    public static void main(String[] args) {
		System.out.print(Characters.inputMessage());
		System.out.print(new Characters().count(new Scanner(System.in).next()));
    }
	
	private static String requestUserInput(){
		System.out.print(Characters.inputMessage());
		String userInput = loopTillUserEntersCorrectInput();
		return userInput;
	}

	private static String loopTillUserEntersCorrectInput(){
		String userInput = null;
		do{
		  userInput = getCorrectUserInput();
		}while(userInput == null);
		return userInput;
	}

	private static String getCorrectUserInput(){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		if(input.length() > 0) {
			return input;
		}else {
		  System.out.print("Please enter some text ");
		  return null;
		}
	}
}