module com.code_source.final_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;


    opens com.code_source.final_project to javafx.fxml;
    exports com.code_source.final_project.controller;
    opens com.code_source.final_project.controller to javafx.fxml;
    exports com.code_source.final_project.view;
    opens com.code_source.final_project.view to javafx.fxml;
    exports com.code_source.final_project.model;
    opens com.code_source.final_project.model to javafx.fxml;
}