package com.example.valagentprofile;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AgentProfileController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("agent-profile-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("add-agent-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<?> agentAbilities;

    @FXML
    private Button agentDetails;

    @FXML
    private ImageView agentImage;

    @FXML
    private Label agentName;

    @FXML
    private ComboBox<?> agentSelectComboBox;

    @FXML
    private Button createNewAgent;


    private AgentDetails jett;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        jett = new AgentDetails("Jett","Dash", "Smoke", "Daggers", "updraft");
        jett = new AgentDetails("Jett", new ArrayList<String>());
        jett.addAbilities(new String[]{"Dash","Daggers","Updraft","smoke"});
        jett();

    }

    private void jett(){

        agentName.setText(jett.getAgent());
        //agentAbilities.getItems().addAll(jett.getJettAbilities());

    }

}