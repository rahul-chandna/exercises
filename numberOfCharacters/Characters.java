public class Characters {
    public String count(String userInput) {
        return outputStart() + userInput.length() + outputEnd();
    }

    public static String outputStart() {
        return "Homer has ";
    }

    public static String outputEnd() {
        return " characters.";
    }

    public static String inputMessage() {
        return "What is the input string? ";
    }

}
