package com.code_source.final_project.view;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class MainScene extends Scene {
    //name
    private Label nameLabel = new Label("NAME:");
    private TextField nameText = new TextField();

    //DOB
    private Label dobLabel = new Label("DATE OF BIRTH:");
    private DatePicker datePicker = new DatePicker();

    //Gender
    private Label genderLabel = new Label("GENDER");

    public MainScene() {
        super(new GridPane(), 500 ,200);

        RadioButton maleRadio = new RadioButton("Male");
        ToggleGroup groupGender = new ToggleGroup();
        maleRadio.setToggleGroup(groupGender);
        RadioButton femaleRadio = new RadioButton("Female");
        femaleRadio.setToggleGroup(groupGender);
        RadioButton nonBinaryRadio = new RadioButton("Non-Binary");
        nonBinaryRadio.setToggleGroup(groupGender);

    }
}
