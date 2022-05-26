package com.code_source.final_project.view;

import com.code_source.final_project.controller.Controller;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

//test 1.1
public class View extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ViewNavigator.setStage(stage);
        stage.getIcons().add(new Image("pngegg.png"));
        ViewNavigator.loadScene("Registration Form", new MainScene());
    }
    @Override
    public void stop() throws Exception {
        Controller.getInstance().saveData();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }


}