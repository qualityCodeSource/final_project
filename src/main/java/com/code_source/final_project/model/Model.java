package com.code_source.final_project.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.io.*;
import java.util.Arrays;

public class Model {

    public static final String BINARY_FILE = "Students.dat";

    public static boolean binaryFileHasData()
    {
        File binaryFile = new File(BINARY_FILE);
        // An empty file is 4 bytes
        return (binaryFile.exists() && binaryFile.length() >= 5L);

    }

    public static ObservableList<Student> populateListFromBinaryFile()
    {
        // New, empty list
        ObservableList<Student> allStudents = FXCollections.observableArrayList();
        try {
            ObjectInputStream fileReader = new ObjectInputStream(new FileInputStream(BINARY_FILE));
            // Read from binary file into an array
            Student[] array = (Student[]) fileReader.readObject();
            // Loop through array and add each laureate to the list
            allStudents.addAll(Arrays.asList(array));
            fileReader.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return allStudents;
    }

    public static boolean writeDataToBinaryFile(ObservableList<Student> allStudentsList)
    {
        Student[] array = new Student[allStudentsList.size()];
        // Let's copy all the list data into the array
        for (int i = 0; i < array.length; i++) {
            array[i] = allStudentsList.get(i);
        }
        // Write to the binary file
        try {
            ObjectOutputStream fileWriter = new ObjectOutputStream(new FileOutputStream(BINARY_FILE));
            fileWriter.writeObject(array);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true;
    }

}
