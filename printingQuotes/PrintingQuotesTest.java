class PrintingQuotesTest {
    public static void main(String[] args) {
        final String quote = "These arn't the droids you're looking for";
        final String saidBy = "Obi-Wan Kenobi";

        String output = new PrintingQuotes().quoteAndSaidBy(quote, saidBy);

        String expected = saidBy+PrintingQuotes.says()+PrintingQuotes.escapeString()+quote+"."+PrintingQuotes.escapeString();
        assertEquals(output, expected);
    }

    private static void assertEquals(String output, String expected) {
        if (!output.equals(expected)) {
            throw new Error("expected " + expected + " but was " + output);
        }
    }
}