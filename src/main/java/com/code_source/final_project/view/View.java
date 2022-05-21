package com.code_source.final_project.view;

import com.code_source.final_project.model.Student;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

//test 1.1
public class View extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Label for name
        Label nameLabel = new Label("NAME:");

        //Text Field for Name
        TextField nameText = new TextField();

        //Label for Date of Birth
        Label dobLabel = new Label("DATE OF BIRTH:");

        //date picker to choose date
        DatePicker datePicker = new DatePicker();

        //Label for gender
        Label genderLabel = new Label("GENDER");

        //Toggle group of radio button
        ToggleGroup groupGender = new ToggleGroup();
        RadioButton maleRadio = new RadioButton("Male");
        maleRadio.setToggleGroup(groupGender);
        RadioButton femaleRadio = new RadioButton("Female");
        femaleRadio.setToggleGroup(groupGender);
        RadioButton nonBinaryRadio = new RadioButton("Non-Binary");
        nonBinaryRadio.setToggleGroup(groupGender);

        //Label for technologies known
        Label technologiesLabel = new Label("LANGUAGES:");

        //Check box for education
        CheckBox javaCheckBox=new CheckBox("Java");
        javaCheckBox.setIndeterminate(false);
        CheckBox cppCheckBox=new CheckBox("C++");
        cppCheckBox.setIndeterminate(false);
        CheckBox pythonCheckBox = new CheckBox("Python");
        pythonCheckBox.setIndeterminate(false);

        //Label for education
        Label educationLabel = new Label("EDUCATION:");

        //list view for educational qualification
        ListView<Object> edulist = new ListView<>();
        ObservableList<Object> data = FXCollections.observableArrayList();
        data.addAll("No Formal Education","Current Student", "Associate Degree", "Bachelor Degree", "Master Degree", "PhD.");
        edulist.setItems(data);
        edulist.setPrefSize(100, 100);

        //Label for location
        Label locationLabel=new Label("LOCATION:");
        locationLabel.setAlignment(Pos.BOTTOM_RIGHT);

        //choice box for location
        ChoiceBox<Object> locationChoiceBox = new ChoiceBox<>();
        locationChoiceBox.getItems().addAll("Community College", "State College", "University of California", "Self Taught");

        //Label for register
        Button buttonRegister =new Button("Register");

        //List view from binary file.
        ListView<Student> studentsLV = new ListView<>();
        studentsLV.setPrefSize(200, 300);

        //Crafting a grid pane
        GridPane gridPane=new GridPane();

        //setting size for pane
        gridPane.setMinSize(500, 200);

        //setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(10);
        gridPane.setHgap(5);

        //setting the grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //arranging all the nodes in the grid
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);

        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);

        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleRadio, 1, 2);
        gridPane.add(femaleRadio, 2, 2);
        gridPane.add(nonBinaryRadio, 3, 2);

        gridPane.add(technologiesLabel, 0, 3);
        gridPane.add(javaCheckBox, 1, 3);
        gridPane.add(cppCheckBox, 2, 3);
        gridPane.add(pythonCheckBox, 3, 3);

        gridPane.add(educationLabel, 0 ,4);
        gridPane.add(edulist, 1, 4);

        gridPane.add(locationLabel, 0, 5);
        gridPane.add(locationChoiceBox, 1, 5);

        gridPane.add(buttonRegister, 2, 7);

        gridPane.add(studentsLV, 3, 1);

        //NODE STYLE
        buttonRegister.setStyle("-fx-background-color:green; -fx-text-fill:white;");
        nameLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        dobLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        genderLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        technologiesLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        educationLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        locationLabel.setStyle("-fx-font:normal bold 15px 'serif' ");

        //setting the background color
        gridPane.setStyle("-fx-background-color:BEIGE");

        //creating a scene object
        Scene scene = new Scene(gridPane);

        //setting the title of stage
        stage.setTitle("Registration Form");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}