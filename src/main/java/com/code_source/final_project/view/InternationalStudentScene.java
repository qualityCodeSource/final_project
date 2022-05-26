package com.code_source.final_project.view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class InternationalStudentScene extends Scene {

    Button buttonBack = new Button("Back");

    public InternationalStudentScene()
    {
        super(new GridPane(), 800, 500);
        GridPane gridPane = new GridPane();

        buttonBack.setOnAction(e -> ViewNavigator.loadScene("Registration Form", new MainScene()));

        gridPane.add(buttonBack, 1, 1);

        this.setRoot(gridPane);

    }
}
