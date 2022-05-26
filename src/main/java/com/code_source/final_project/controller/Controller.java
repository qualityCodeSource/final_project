package com.code_source.final_project.controller;

import com.code_source.final_project.model.Model;
import com.code_source.final_project.model.Student;
import javafx.collections.ObservableList;


public class Controller {
    private static Controller theInstance;
    private ObservableList<Student> mAllStudentsList;
    private Controller() { }

    public static Controller getInstance()
    {
        if (theInstance == null) {
            theInstance = new Controller();
            //if (Model.binaryFileHasData())
            theInstance.mAllStudentsList = Model.populateListFromBinaryFile();
        }
        return theInstance;
    }
    public ObservableList<Student> getAllStudents() {
        return mAllStudentsList;
    }

    public void saveData() {
        Model.writeDataToBinaryFile(mAllStudentsList);
    }



}