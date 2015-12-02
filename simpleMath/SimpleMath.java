class SimpleMath{
	public static final String firstNumber = "What is the first number? ";
	public static final String secondNumber = "What is the second number? ";
	private double a, b;
	
	public SimpleMath(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	public double operation(char operation){
		switch(operation){
			case '+':
			return a + b;
			
			case '-':
			return a - b;
			
			case '*':
			return a * b;
			
			case '/':
			return a / b;
		}
		return 0;
	}
	
}