import java.util.*;

public class MadLib {
    public List<String> story(String noun, String verb, String adjective, String adverb) {
        List<String> output = new ArrayList();
		output.add("Do you walk your ");
		output.add(adjective);
		output.add(" ");
		output.add(noun);
		output.add(" ");
		output.add(adverb);
		output.add("? ");
		output.add("That's hilarious!");
		
		return output;
	}
	
    public static String outputStart() {
        return "Homer has ";
	}
	
    public static String outputEnd() {
        return " MadLib.";
	}
	
    public static String[] inputMessages() {
        String inputs[] = {
			"Enter a noun: ",
			"Enter a verb: ",
			"Enter an adjective: ",
			"Enter an adverb: "	
		};
		
		return inputs;
	}
	
}
