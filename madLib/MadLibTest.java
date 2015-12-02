import java.util.*;

class MadLibTest {
    public static void main(String[] args) {
        final String noun = "dog";
		final String verb = "walk";
		final String adjective = "blue"; 
		final String adverb = "quickly";
		
        List<String> output = new MadLib().story(noun, verb, adjective, adverb);
		
        assertContains(output, noun, verb, adjective, adverb);
	}
	
    private static void assertContains(List<String> outputList, String... expected) {
        int count = 0;
		for (String input:expected) {
			for(String output:outputList){
				if(output.contains(input)) {
					count++;
				}
			}
		}
		if(count != expected.length){
			throw new Error("strings do not match.");
		}
	}
}