package com.code_source.final_project.view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class TransferStudentScene extends Scene
{
    Button buttonBack = new Button("Back");

    public TransferStudentScene()
    {
        super(new GridPane(), 500, 500);
        GridPane gridPane = new GridPane();

        buttonBack.setOnAction(e -> ViewNavigator.loadScene("Registration Form", new MainScene()));

        gridPane.add(buttonBack, 1, 1);

        this.setRoot(gridPane);
    }
}
