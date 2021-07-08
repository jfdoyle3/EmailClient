package com.jfdeveloper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Launcher extends Application {

    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent parent= FXMLLoader.load(getClass().getResource("view/LoginWindow.fxml"));
//        Button button=new Button("Click!");
//        button.setOnAction(e ->{
//            System.out.println("Clicked!");
//        });
//        StackPane stackPane=new StackPane();
//        stackPane.getChildren().add(button);

//        Scene scene = new Scene(stackPane, 300, 250);
//        primaryStage.setScene(scene);
        Scene scene = new Scene(parent, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.getScene();
        primaryStage.show();
    }
}
