import java.util.*;

class SimpleMathCLITest {
    public static void main(String[] args) {
		char []operations = {'+','-','*','/'};
		double a = requestUserInput(SimpleMath.firstNumber);
		double b = requestUserInput(SimpleMath.secondNumber);
		SimpleMath simpleMath = new SimpleMath(a, b);
		
		StringBuilder stringBuilder = new StringBuilder();
		for(char operation:operations){
			stringBuilder.append(a);
			stringBuilder.append(" ");
			stringBuilder.append(operation);
			stringBuilder.append(" ");
			stringBuilder.append(b);
			stringBuilder.append(" = ");
			stringBuilder.append(simpleMath.operation(operation));
			stringBuilder.append("\n");
		}
		System.out.println(stringBuilder.toString());
	}
	
	private static double requestUserInput(String message){
		System.out.print(message);
		Double userInput = loopTillUserEntersCorrectInput(message);
		return userInput;
	}
	
	private static double loopTillUserEntersCorrectInput(String message){
		Double userInput = null;
		do{
			userInput = getCorrectUserInput(message);
		}while(userInput == null);
		return userInput;
	}
	
	private static Double getCorrectUserInput(String message){
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextDouble()) {
			double input = scanner.nextDouble();
			if(input >= 0){
				return input;
			}
		}
		System.out.print("Please enter a valid positive number for "+ message);
		return null;
		
	}
}