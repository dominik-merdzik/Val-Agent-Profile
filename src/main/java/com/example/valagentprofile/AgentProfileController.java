package com.example.valagentprofile;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AgentProfileController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}