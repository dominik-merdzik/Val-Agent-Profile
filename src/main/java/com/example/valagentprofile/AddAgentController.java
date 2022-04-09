package com.example.valagentprofile;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AddAgentController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void switchToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("agent-profile-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private TextField abilityFourTextField;

    @FXML
    private TextField abilityOneTextField;

    @FXML
    private TextField abilityThreeTextField;

    @FXML
    private TextField abilityTwoTextField;

    @FXML
    private Button addAgentButton;

    @FXML
    private TextField agentNameTextField;

    @FXML
    private TextField agentRoleTextField;

    @FXML
    private Button homeButton;

    @FXML
    private TextField releasePatchTextField;

    String agentName,agentRole, releasePatch, abilityOne, abilityTwo, abilityThree, abilityFour;
    private Agent usersAgent;

    void addAgentButtonEvent (ActionEvent event)throws IOException{

        agentName = agentNameTextField.getText();
        agentRole = agentRoleTextField.getText();
        releasePatch = releasePatchTextField.getText();
        abilityOne = abilityOneTextField.getText();
        abilityTwo = abilityTwoTextField.getText();
        abilityThree = abilityThreeTextField.getText();
        abilityFour = abilityFourTextField.getText();

        usersAgent = new Agent(agentName, new ArrayList<String>(),agentRole, Double.parseDouble(releasePatch));
        usersAgent.addAbilities(new String[]{abilityOne,abilityTwo,abilityThree,abilityFour});



    }



    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {




    }

}
