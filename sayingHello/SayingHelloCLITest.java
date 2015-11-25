import java.util.*;

class SayingHelloCLITest {
    public static void main(String[] args) {
		System.out.print(SayingHello.inputMessage());
		System.out.print(new SayingHello().hello(new Scanner(System.in).next()));
    }
}