package com.jfdeveloper.controller;

import com.jfdeveloper.EmailManager;
import com.jfdeveloper.view.ViewFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;

public class OptionsWindowController extends BaseController {

    @FXML
    private
    ChoiceBox<?> themePicker;

    @FXML
    private Slider fontSizePicker;

    @FXML
    void cancelButtonAction() {
        System.out.println("cancel");
    }

    @FXML
    void applyButtonAction() {
        System.out.println("apply");
    }

    public OptionsWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }
}
