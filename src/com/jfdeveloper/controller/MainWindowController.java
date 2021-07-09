package com.jfdeveloper.controller;

import com.jfdeveloper.EmailManager;
import com.jfdeveloper.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.web.WebView;

public class MainWindowController extends BaseController {

    @FXML
    private TreeView<?> emailsTreeView;

    @FXML
    private WebView emailsWebView;

    @FXML
    private TableView<?> emailsTableView;

    @FXML
    void optionsAction() {
    }


    public MainWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }



}
