package com.example.alternatorscalculator;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("generators.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 450);
        stage.setTitle("Consumptions evaluation");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
//https://webdeasy.de/en/error-a-jni-error-has-occured-how-to-fix-this-java-error/