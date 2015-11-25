import java.util.*;

class PrintingQuotesCLITest {
    public static void main(String[] args) {
		String quote = requestUserInput(PrintingQuotes.inputQuote());
		String saidBy = requestUserInput(PrintingQuotes.inputSaidBy());
		System.out.print(new PrintingQuotes().quoteAndSaidBy(quote, saidBy));
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