package com.jfdeveloper.view;

import com.jfdeveloper.EmailManager;
import com.jfdeveloper.controller.BaseController;
import com.jfdeveloper.controller.LoginWindowController;
import com.jfdeveloper.controller.MainWindowController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {

    private EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }

    public void showLoginWindow() {
        System.out.println("login window");

        BaseController controller = new LoginWindowController(emailManager, this, "LoginWindow.fxml");
        initializeStage(controller);
    }

    public void showOptionsWindow(){
        System.out.println("options window");

        BaseController controller = new LoginWindowController(emailManager, this, "OptionsWindow.fxml");
        initializeStage(controller);
    }

    public void showMainWindow(){
        System.out.println("main window");

        BaseController controller = new MainWindowController(emailManager, this, "MainWindow.fxml");
        initializeStage(controller);
    }

    private void initializeStage(BaseController baseController){

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
        fxmlLoader.setController(baseController);
        Parent parent;

        try {
            parent = fxmlLoader.load();

        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void closeStage(Stage stage){
        stage.close();
    }
}
