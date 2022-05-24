package com.code_source.final_project.view;

import com.code_source.final_project.controller.Controller;
import com.code_source.final_project.model.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.util.StringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainScene extends Scene {
    //name
    private Label nameLabel = new Label("NAME:");
    private TextField nameText = new TextField();

    //DOB
    private Label dobLabel = new Label("DATE OF BIRTH:");
    private DatePicker datePicker = new DatePicker();

    //Gender
    private Label genderLabel = new Label("GENDER");
    private ToggleGroup groupGender = new ToggleGroup();
    private RadioButton maleRadio = new RadioButton("Male");
    private RadioButton femaleRadio = new RadioButton("Female");
    private RadioButton nonBinaryRadio = new RadioButton("Non-Binary");

    //languages
    private Label technologiesLabel = new Label("LANGUAGES:");
    private CheckBox javaCheckBox=new CheckBox("Java");
    private CheckBox cppCheckBox=new CheckBox("C++");
    private CheckBox pythonCheckBox = new CheckBox("Python");

    //education
    private Label educationLabel = new Label("EDUCATION:");
    private ListView<Object> edulist = new ListView<>();
    private ObservableList<Object> data = FXCollections.observableArrayList();

    //location
    private Label locationLabel=new Label("LOCATION:");
    private ChoiceBox<Object> locationChoiceBox = new ChoiceBox<>();

    //Register Button
    private Button buttonRegister =new Button("Register");

    //listview from binary file
    private Controller controller = Controller.getInstance();
    private ListView<Student> studentsLV = new ListView<>();
    private ObservableList<Student> studentsList;
    private Student selectedStudent;


    public MainScene() {
        super(new GridPane(), 800 ,800);

        //gridpane
        GridPane gridPane=new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(5);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setAlignment(Pos.CENTER);

        //gender
        maleRadio.setToggleGroup(groupGender);
        femaleRadio.setToggleGroup(groupGender);
        nonBinaryRadio.setToggleGroup(groupGender);

        //languages
        javaCheckBox.setIndeterminate(false);
        cppCheckBox.setIndeterminate(false);
        pythonCheckBox.setIndeterminate(false);

        //education
        data.addAll("No Formal Education","Current Student", "Associate Degree", "Bachelor Degree", "Master Degree", "PhD.");
        edulist.setItems(data);
        edulist.setPrefSize(100, 100);

        //location
        locationChoiceBox.getItems().addAll("Community College", "State College", "University of California", "Self Taught");


        //listview from binary file
        studentsLV.setPrefSize(200, 300);

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

        //register button
        buttonRegister.setOnAction(e -> addStudent());
        gridPane.add(buttonRegister, 2, 7);

        //listview from binary file
        studentsLV.setPrefSize(200, 300);
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

        studentsList = controller.getAllStudents();
        studentsLV.setItems(studentsList);


        this.setRoot(gridPane);
    }

    private void addStudent() {
        // Read from all text fields
        try {
            String name = nameText.getText();
            String DOB = datePicker.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));;

            String gender = (String) groupGender.getSelectedToggle().getUserData();
            String languages = "";
            if (javaCheckBox.isSelected())
                languages+="JAVA ";
            if (cppCheckBox.isSelected())
                languages+="C++ ";
            if (pythonCheckBox.isSelected())
                languages+="Python ";
            String education = edulist.getSelectionModel().toString();
            String location = locationChoiceBox.getSelectionModel().toString();
            studentsList.add(0, new Student(name, DOB, gender, languages, education, location));
            studentsLV.refresh();
        }catch(NullPointerException e){}
    }

    private void updateDisplay() {
        studentsLV.refresh();
    }


}
