package com.code_source.final_project.controller;

import com.code_source.final_project.model.Model;
import com.code_source.final_project.model.Student;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;


public class Controller {
    private static Controller theInstance;
    private ObservableList<Student> mAllStudentsList;
    private Controller() { }

    public static Controller getInstance()
    {
        // If theInstance is null, create a new object
        if (theInstance == null) {
            theInstance = new Controller();
            // Fill the allLaureatesList with data from Model
            // If the binary file has data, fill with binary file
            //if (Model.binaryFileHasData())
            theInstance.mAllStudentsList = Model.populateListFromBinaryFile();
        }
        // Otherwise, return theInstance
        return theInstance;
    }
    public ObservableList<Student> getAllStudents() {
        return mAllStudentsList;
    }

    public void saveData() {
        Model.writeDataToBinaryFile(mAllStudentsList);
    }



}