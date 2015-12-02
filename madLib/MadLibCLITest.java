import java.util.*;

class MadLibCLITest {
    public static void main(String[] args) {
		List <String> output = new MadLib().story(requestUserInput(MadLib.inputMessages()[0]),requestUserInput(MadLib.inputMessages()[1]),requestUserInput(MadLib.inputMessages()[2]),requestUserInput(MadLib.inputMessages()[3]));
		
		System.out.printf("%s %s %s %s %s %s %s %s",output.get(0),output.get(1),output.get(2),output.get(3),output.get(4),output.get(5),output.get(6),output.get(7));
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