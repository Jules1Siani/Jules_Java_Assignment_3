
/*
 (Displaying a Sentence with Its Words Reversed) 
 Write an application that inputs a line of text, 
 tokenizes the line with String method split and outputs 
 the tokens in reverse order. Use space characters as delimiters.
 */


import java.util.Scanner;

public class Chap16_ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Enter the sentence
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        // divide the sentence into words 
        String[] words = input.split(" ");
        
        // Reserve the sentence and print
        System.out.print("Reversed sentence: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        
        scanner.close();
    } // scanner
}
