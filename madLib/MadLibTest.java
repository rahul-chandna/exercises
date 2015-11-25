class MadLibTest {
    public static void main(String[] args) {
        final String noun = "dog";
		final String verb = "walk";
		final String adjective = "blue"; 
		final String adverb = "quickly";

        String output = new MadLib().story(noun, verb, adjective, adverb);

        assertContains(output, noun, verb, adjective, adverb);
    }

    private static void assertContains(String output, String... expected) {
        for (String input:expected) {
			if(!output.contains(input)){
				throw new Error("expected " + expected + " but was " + output);
			}
        }
    }
}