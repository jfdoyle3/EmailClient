package com.jfdeveloper.controller;

import com.jfdeveloper.EmailManager;
import com.jfdeveloper.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginWindowController extends BaseController {

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField emailAddressField;

    @FXML
    private Label errorLabel;

    @FXML
    void loginButtonAction() {

        System.out.println("loginButtonAction");

        viewFactory.showMainWindow();
    }


    public LoginWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }
}
