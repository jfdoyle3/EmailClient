package com.jfdeveloper.controller;

import com.jfdeveloper.EmailManager;
import com.jfdeveloper.view.ColorTheme;
import com.jfdeveloper.view.ViewFactory;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class OptionsWindowController extends BaseController implements Initializable {

    @FXML
    private
    ChoiceBox<ColorTheme> themePicker;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setUpThemePicker();
    }

    private void setUpThemePicker() {
        themePicker.setItems(FXCollections.observableArrayList(ColorTheme.values()));
        themePicker.setValue(viewFactory.getColorTheme());
    }
}
