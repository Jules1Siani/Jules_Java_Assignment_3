

import java.util.Random;

public class Chap14_ex5 {
    public static void main(String[] args) {
        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};

        Random random = new Random();

        // Generate and display 20 random sentences
        for (int i = 0; i < 20; i++) {
            StringBuilder sentence = new StringBuilder();

            // Capitalize the first word
            sentence.append(articles[random.nextInt(articles.length)].substring(0, 1).toUpperCase())
                    .append(articles[random.nextInt(articles.length)].substring(1))
                    .append(" ")
                    .append(nouns[random.nextInt(nouns.length)])
                    .append(" ")
                    .append(verbs[random.nextInt(verbs.length)])
                    .append(" ")
                    .append(prepositions[random.nextInt(prepositions.length)])
                    .append(" ")
                    .append(articles[random.nextInt(articles.length)])
                    .append(" ")
                    .append(nouns[random.nextInt(nouns.length)])
                    .append(".");

            System.out.println(sentence);
        }
    }
}
