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
public class DictionaryApp {
    public static void main(String[] args) {
        DictionaryModel model = new DictionaryModel();
        DictionaryView view = new DictionaryView();
        DictionaryController controller = new DictionaryController(model, view);
        controller.run();
    }
}

