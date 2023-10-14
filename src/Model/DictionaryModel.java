/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sonhu
 */

public class DictionaryModel {
    private Map<String, String> dictionary;

    public DictionaryModel() {
        dictionary = new HashMap<>();
    }

    public void addWord(String english, String vietnamese) {
        dictionary.put(english, vietnamese);
    }

    public void deleteWord(String english) {
        dictionary.remove(english);
    }

    public String translateWord(String english) {
        return dictionary.get(english);
    }
}

    

