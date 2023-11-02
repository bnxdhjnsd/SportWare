package com.example.demo;

import Util.FileUtilE;
import javafx.fxml.FXML;
/**
 * The 'Edit' interface provides a contract for classes that handle the editing of items in the application.
 */
public interface Edit {
    /**
     * Edits the selected event.
     *
     * @param selected The event to be edited.
     */
    public static void edit(Event selected){

    }
    /**
     * Confirms and applies the edit to the item.
     */
    public void addConfirm();
}
