/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DictionaryModel;
import View.DictionaryView;

/**
 *
 * @author sonhu
 */
public class DictionaryController {
    private DictionaryModel model;
    private DictionaryView view;

    public DictionaryController(DictionaryModel model, DictionaryView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int choice;
        do {
            choice = view.displayMenu();
            switch (choice) {
                case 1:
                    addWord();
                    break;
                case 2:
                    deleteWord();
                    break;
                case 3:
                    translateWord();
                    break;
                case 4:
                    view.printMessage("Exiting the program.");
                    break;
                default:
                    view.printMessage("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void addWord() {
    String english = view.getEnglishWord();
    String vietnamese = view.getVietnameseWord();
    model.addWord(english, vietnamese);
    view.printMessage("Successful");
}


    private void deleteWord() {
        String english = view.getEnglishWord();
        model.deleteWord(english);
        view.printMessage("Successful");
    }

    private void translateWord() {
        String english = view.getEnglishWord();
        String translation = model.translateWord(english);
        if (translation != null) {
            view.printTranslation(translation);
        } else {
            view.printMessage("Word not found in the dictionary.");
        }
    }
}

