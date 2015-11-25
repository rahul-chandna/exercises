class SayingHelloTest {
    public static void main(String[] args) {
        final String userInput = "test";

        String output = new SayingHello().hello(userInput);

        String expected = SayingHello.outputStart() + userInput + SayingHello.outputEnd();
        assertEquals(output, expected);
    }

    private static void assertEquals(String output, String expected) {
        if (!output.equals(expected)) {
            throw new Error("expected " + expected + " but was " + output);
        }
    }
}