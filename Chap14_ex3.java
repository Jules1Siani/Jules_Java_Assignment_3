
/*
 14.3 (Comparing Strings) Write an application that uses 
 String method compareTo to compare two strings input by the user. 
 Output whether the first string is less than, equal to or greater than the second.*/

 import java.util.Scanner;

public class Chap14_ex3 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // Enter the second string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // Compare the strings using compareTo method
        int comparison = firstString.compareTo(secondString);

        // Output the comparison result
        if (comparison < 0) {
            System.out.println("The first string is less than the second string.");
        } else if (comparison > 0) {
            System.out.println("The first string is greater than the second string.");
        } else {
            System.out.println("The first string is equal to the second string.");
        }

        // scanner
        scanner.close();
    }
}
