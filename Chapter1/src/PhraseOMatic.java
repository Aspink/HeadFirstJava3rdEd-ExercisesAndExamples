public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extensible","reactive", "agent based", "functional", "AI enabled","strongly typed", "jolly", "strange"};
        String[] wordListTwo = {"loosely coupled", "six sigma","asynchronous", "event driven", "pub-sub", "IoT", "cloudnative", "service oriented", "containerized", "serverless","microservices", "distributed ledger", "drunker driven", "facultative"};
        String[] wordListThree = {"framework", "library","DSL", "REST API", "repository", "pipeline", "servicemesh", "architecture", "perspective", "design","orientation", "distribution","function"};
        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();

        //let's make some changes
        System.out.println("What we need is a... ");

        // print out the phrases
        for (int i = 0; i < 10; i++) {
            int rand1 = randomGenerator.nextInt(oneLength);
            int rand2 = randomGenerator.nextInt(twoLength);
            int rand3 = randomGenerator.nextInt(threeLength);
            // now build a phrase
            String phrase = wordListOne[rand1] + " " +wordListTwo[rand2] + " " + wordListThree[rand3];
            System.out.println(phrase);
        }

    }

}
