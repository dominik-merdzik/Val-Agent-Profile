package com.example.valagentprofile;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

    @FXML
    void switchToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("agent-profile-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void switchToScene2(ActionEvent event) throws IOException{
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
    private ListView<String> agentAbilities;

    @FXML
    private Button agentDetails;

    @FXML
    private ImageView agentImage;

    @FXML
    private Label agentName;

    @FXML
    private ComboBox<String> agentSelectComboBox;

    @FXML
    private Button createNewAgent;


    @FXML
    void Select (ActionEvent event)throws IOException{
        String selectedAgent = agentSelectComboBox.getSelectionModel().getSelectedItem().toString();
        agentAbilities.getItems().clear();
        agentName.setText("");

        if (selectedAgent.equals("Jett")){
            jett();
        }
    }

    private AgentDetails jett;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        jett = new AgentDetails("Jett","Dash", "Smoke", "Daggers", "updraft");
        jett = new AgentDetails("Jett", new ArrayList<String>());
//        jett.addAbilities(new String[]{"Dash","Daggers","Updraft","smoke"});
        ObservableList<String> list = FXCollections.observableArrayList("Astra", "Breach", "Brimstone", "Chamber", "Cypher", "Jett", "Kay/o"
                , "Killjoy", "Neon", "Omen", "Phoenix", "Raze", "Reyna", "Sage", "Skye", "Sova"
                , "Viper", "Your");
        agentSelectComboBox.setItems(list);




    }

    private void jett(){

        agentName.setText(jett.getAgent());
//        agentImage.setImage(jett.getAgentImage());
//        agentImage.setFitHeight(310);
//        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(jett.getJettAbilities());

    }

}