/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author sonhu
 */
import java.util.Scanner;

public class DictionaryView {
    private Scanner scanner;

    public DictionaryView() {
        scanner = new Scanner(System.in);
    }

    public int displayMenu() {
    int choice;
    do {
        try {
            System.out.println("Bilingual Dictionary Menu:");
            System.out.println("1. Add word");
            System.out.println("2. Delete word");
            System.out.println("3. Translate word");
            System.out.println("4. Exit program");
            System.out.print("Enter your choice (1/2/3/4): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        } catch (java.util.InputMismatchException e) {
            scanner.nextLine(); // Consume the invalid input
            choice = -1; // Handle invalid input
        }
    } while (choice < 1 || choice > 4);

    return choice;
}


    public void printTranslation(String translation) {
        System.out.println("Translation: " + translation);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

   public String getEnglishWord() {
    System.out.print("Enter an English word: ");
    return scanner.nextLine();  // Use nextLine to read the whole line
}

public String getVietnameseWord() {
    System.out.print("Enter a Vietnamese word: ");
    return scanner.nextLine();  // Use nextLine to read the whole line
}

    public void closeScanner() {
        scanner.close();
    }
}
