class CharactersTest {
    public static void main(String[] args) {
        final String userInput = "Homer";

        String output = new Characters().count(userInput);

        String expected = Characters.outputStart() + userInput.length() + Characters.outputEnd();
        assertEquals(output, expected);
    }

    private static void assertEquals(String output, String expected) {
        if (!output.equals(expected)) {
            throw new Error("expected " + expected + " but was " + output);
        }
    }
}