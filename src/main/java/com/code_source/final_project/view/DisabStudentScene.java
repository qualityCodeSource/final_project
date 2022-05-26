package com.code_source.final_project.view;

import com.code_source.final_project.controller.Controller;
import com.code_source.final_project.model.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class DisabStudentScene extends Scene {

    private Button buttonBack = new Button("BACK");
    //name
    private final Label nameLabel = new Label("NAME:");
    private final TextField nameText = new TextField();

    //DOB
    private final Label dobLabel = new Label("DATE OF BIRTH:");
    private final DatePicker datePicker = new DatePicker();

    //Gender
    private final Label genderLabel = new Label("GENDER");
    private final ToggleGroup groupGender = new ToggleGroup();
    private final RadioButton maleRadio = new RadioButton("Male");
    private final RadioButton femaleRadio = new RadioButton("Female");
    private final RadioButton nonBinaryRadio = new RadioButton("Non-Binary");

    //languages
    private final Label languagesLabel = new Label("LANGUAGES:");
    private final CheckBox javaCheckBox=new CheckBox("Java");
    private final CheckBox cppCheckBox=new CheckBox("C++");
    private final CheckBox pythonCheckBox = new CheckBox("Python");

    //education
    private final Label educationLabel = new Label("EDUCATION:");
    private final ListView<String> edulist = new ListView<>();
    private final ObservableList<String> data = FXCollections.observableArrayList();

    //location
    private final Label locationLabel=new Label("LOCATION:");
    private final ChoiceBox<Object> locationChoiceBox = new ChoiceBox<>();

    //disability
    private final Label disabilityLabel = new Label("DISABILITY:");
    private final TextField disabilityText = new TextField();

    //assistance needed
    private final Label assistanceLabel = new Label("ASSISTANCE NEEDED?");
    private final ToggleGroup assistanceGroup = new ToggleGroup();
    private final RadioButton no = new RadioButton("NO");
    private final RadioButton yes = new RadioButton("YES");

    //Register Button
    private final Button buttonRegister =new Button("Register");

    //Delete Button
    private final Button buttonDelete = new Button("Delete");

    //listview from binary file
    private final Controller controller = Controller.getInstance();
    private final ListView<Student> studentsLV = new ListView<>();
    //private final ObservableList<Student> studentsList;
    private Student selectedStudent;


    public DisabStudentScene()
    {
        super(new GridPane(), 800, 500);
        GridPane gridPane = new GridPane();

        buttonBack.setOnAction(e -> ViewNavigator.loadScene("Registration Form", new MainScene()));

        gridPane.add(buttonBack, 1, 1);




        this.setRoot(gridPane);


    }
}
