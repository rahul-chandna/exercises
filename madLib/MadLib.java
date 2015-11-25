public class MadLib {
    public String story(String noun, String verb, String adjective, String adverb) {
        return new StringBuilder("Do you walk your ")
		.append(adjective)
		.append(" ")
		.append(noun)
		.append(" ")
		.append(adverb)
		.append("? ")
		.append("That's hilarious!").toString();
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
