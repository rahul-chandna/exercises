import java.util.*;

class MadLibCLITest {
    public static void main(String[] args) {
		System.out.print(new MadLib().story(requestUserInput(MadLib.inputMessages()[0]),requestUserInput(MadLib.inputMessages()[1]),requestUserInput(MadLib.inputMessages()[2]),requestUserInput(MadLib.inputMessages()[3])));
    }
	
	private static String requestUserInput(String message){
		System.out.print(message);
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