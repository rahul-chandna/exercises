public class PrintingQuotes {
    public String quoteAndSaidBy(String quote, String saidBy) {
        return saidBy+says()+escapeString()+quote+"."+escapeString();
    }
	
	public static String says(){
		return " says, ";
	}
	
	public static String escapeString(){
		return "\"";
	}

    public static String inputQuote() {
        return "What is the quote? ";
    }

    public static String inputSaidBy() {
        return "WWho said it? ";
    }

}
