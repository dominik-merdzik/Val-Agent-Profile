module com.example.valagentprofile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.valagentprofile to javafx.fxml;
    exports com.example.valagentprofile;
}