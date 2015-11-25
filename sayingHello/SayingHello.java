public class SayingHello {
    public String hello(String userInput) {
        return outputStart() + userInput + outputEnd();
    }

    public static String outputStart() {
        return "Hello,";
    }

    public static String outputEnd() {
        return ", nice to meet you !";
    }

    public static String inputMessage() {
        return "What is your name? ";
    }

}
