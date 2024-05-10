
/*
 (Project: Limericks) A limerick is a humorous 
 five-line verse in which the first and second 
 lines rhyme with the fifth, and the third line 
 rhymes with the fourth. Using techniques similar 
 to those developed in Exercise 14.5, write a Java 
 application that produces random limericks. Polishing 
 this application to produce good limericks is a challenging 
 problem, but the result
  will be worth the effort!
 */

 import java.util.Random;

public class Chap14_ex6 {
    public static void main(String[] args) {
        String[] line1 = {"There once was a man from", "A young lady named", "In a town far away from", "Once there was a cat from", "There was a fellow from"};
        String[] line2 = {"Who dreamed he could fly up to", "Whose hobby was cooking with", "Who went out for a walk by", "Who could dance on a ball of", "Who built a big castle in"};
        String[] line3 = {"But he tripped on a rug", "But instead met a bug", "And met a friendly old dog", "And found a pot of gold", "But the castle fell down"};
        String[] line4 = {"And fell into a jug", "And gave him a big hug", "And went for a jog", "And ate it all up", "And scared all the town"};
        String[] line5 = {"His friends laughed with glee", "And now they're family", "His adventure was done", "It was really quite fun", "They all wore a frown"};

        Random random = new Random();

        // Generate and display 5 random limericks
        for (int i = 0; i < 5; i++) {
            StringBuilder limerick = new StringBuilder();

            // Capitalize the first letter of line 1
            limerick.append(line1[random.nextInt(line1.length)].substring(0, 1).toUpperCase())
                    .append(line1[random.nextInt(line1.length)].substring(1))
                    .append(" ")
                    .append(line2[random.nextInt(line2.length)])
                    .append(" ")
                    .append(line3[random.nextInt(line3.length)])
                    .append(".\n")
                    .append(line4[random.nextInt(line4.length)])
                    .append(" ")
                    .append(line5[random.nextInt(line5.length)])
                    .append(".\n");

            System.out.println(limerick);
        }
    }
}
