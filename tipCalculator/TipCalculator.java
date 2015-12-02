import java.util.Scanner;

public class TipCalculator{
	private Bill bill;
	
	public TipCalculator(Bill bill){
		this.bill = bill;
	}
	
	public double calculateTip() {
		return RoundAmount.roundAmountToTwoDigits(calculateTipAmount());
	}
	
	private double calculateTipAmount() {
		return ((bill.getTipPercentage()*bill.getAmount())/100);
	}
	
	public double calculateTotalBill() {
		return RoundAmount.roundAmountToTwoDigits(bill.getAmount() + calculateTip());
	}
	
}
