import java.util.Scanner;

public class TipCalculatorCLI{
  /*
    - user can only enter numbers for bill amount and tip rate
    - keep asking user for correct input
    - only positive numbers allowed
  */

  public static void main(String args[]) {
			double billAmount = requestUserInput("bill amount: ");
			double tipPercentage = requestUserInput("tip percentage: ");
      calculateAndPrintTipAndTotalBill(billAmount, tipPercentage);
	}

  private static void calculateAndPrintTipAndTotalBill(double billAmount, double tipPercentage){
    Bill bill = new Bill(billAmount, tipPercentage);
    TipCalculator tipCalculator = new TipCalculator(bill);
    System.out.println("Tip :$" + tipCalculator.calculateTip());
    System.out.println("Total :$" + tipCalculator.calculateTotalBill());
  }

  private static double requestUserInput(String message){
    System.out.print("Please enter "+message);
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
      return scanner.nextDouble();
    }else {
      System.out.print("Please enter a valid number for "+ message);
      return null;
    }
  }

}
