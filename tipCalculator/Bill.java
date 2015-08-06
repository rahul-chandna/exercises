public class Bill{
	private double amount;
	private	double tipPercentage;

	public Bill(double amount, double tipPercentage){
		this.amount = amount;
		this.tipPercentage = tipPercentage;
		verifyBillAmountAndTipPercentageArePositive();
	}

	private void verifyBillAmountAndTipPercentageArePositive() {
		if(isAmountNegative()){
			throw new RuntimeException("Bill Amount cannot be negative.");
		}
		if(isTipPercentageNegative()){
			throw new RuntimeException("Tip percentage cannot be negative.");
		}
	}

	private boolean isAmountNegative(){
		return getAmount() < 0;
	}

	private boolean isTipPercentageNegative(){
		return getTipPercentage() < 0;
	}

	public double getTipPercentage(){
		return tipPercentage;
	}

	public double getAmount(){
		return amount;
	}

}
