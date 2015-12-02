import java.time.*;

class RetirementCalculator{
	private int currentAge, retirementAge;
	public static final String currentAgeQuestion = "What is your current age? ";
	public static final String retirementAgeQuestion = "At what age would you like to retire? ";
	
	public RetirementCalculator(int currentAge, int retirementAge){
		this.currentAge = currentAge;
		this.retirementAge = retirementAge;
	}
	
	public int getRemainingYears(){
		return retirementAge - currentAge;
	}
	
	public int getRetirementYear(){
		return getCurrentYear() + getRemainingYears();
	}
	
	public int getCurrentYear(){
		return LocalDate.now().getYear();
	}
	
}