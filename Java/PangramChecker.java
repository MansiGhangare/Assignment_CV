//Check if the input is pangram or not. (A pangram is a sentence that contains all the 
//alphabets from A to Z)

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram:");
        
        String input = scanner.nextLine().toLowerCase();
        
        boolean[] alphabetPresent = new boolean[26]; // 26 letters from A to Z
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a';
                alphabetPresent[index] = true;
            }
        }
        
        boolean isPangram = true;
        for (boolean present : alphabetPresent) {
            if (!present) {
                isPangram = false;
                break;
            }
        }
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }
}
