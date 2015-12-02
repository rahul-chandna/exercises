import java.util.*;

class RetirementCalculatorCLITest {
    public static void main(String[] args) {
		int currentAge = requestUserInput(RetirementCalculator.currentAgeQuestion);
		int retirementAge = requestUserInput(RetirementCalculator.retirementAgeQuestion);
		RetirementCalculator retirementCalculator = new RetirementCalculator(currentAge, retirementAge);
		
		int remainingYears = retirementCalculator.getRemainingYears();
		if(remainingYears > 0){
			System.out.printf("You have %d years left until you can retire.\n",remainingYears);
			System.out.printf("It's %d, so you can retire in %d.\n",retirementCalculator.getCurrentYear(),retirementCalculator.getRetirementYear());
		}
		else{
			System.out.println("You can already retire");
			
		}
	}
	
	private static int requestUserInput(String message){
		System.out.print(message);
		int userInput = loopTillUserEntersCorrectInput(message);
		return userInput;
	}
	
	private static int loopTillUserEntersCorrectInput(String message){
		Integer userInput = null;
		do{
			userInput = getCorrectUserInput(message);
		}while(userInput == null);
		return userInput;
	}
	
	private static Integer getCorrectUserInput(String message){
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()) {
			return scanner.nextInt();
		}
		else{
			System.out.print("Please enter a valid positive number for "+ message);
			return null;
		}
	}
}