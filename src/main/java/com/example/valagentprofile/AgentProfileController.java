package com.example.valagentprofile;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
    void switchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("add-agent-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void closeButtonAction() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ListView<String> agentAbilities;

    @FXML
    private Label agentRole;

    @FXML
    private Label agentReleasePatch;

    @FXML
    private Button agentDetails;

    @FXML
    private ImageView agentImage;

    @FXML
    private Label agentName;

    @FXML
    private ComboBox<Agent> agentSelectComboBox;

    @FXML
    private Button createNewAgent;

    @FXML
    private Label currentPatchLabel;

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
    private Button exitButton;

    @FXML
    private TextField releasePatchTextField;


    String agentNameScene, agentRoleScene, releasePatch, abilityOne, abilityTwo, abilityThree, abilityFour;
    private Agent usersAgent;

    @FXML
    void addAgentButtonEvent(ActionEvent event) throws IOException {

        agentNameScene = agentNameTextField.getText();
        agentRoleScene = agentRoleTextField.getText();
        releasePatch = releasePatchTextField.getText();
        abilityOne = abilityOneTextField.getText();
        abilityTwo = abilityTwoTextField.getText();
        abilityThree = abilityThreeTextField.getText();
        abilityFour = abilityFourTextField.getText();


        usersAgent = new Agent(agentNameScene, new ArrayList<String>(), agentRoleScene, Double.parseDouble(releasePatch));
        usersAgent.addAbilities(new String[]{abilityOne, abilityTwo, abilityThree, abilityFour});
        agentSelectComboBox.getItems().add(usersAgent);
    }

    @FXML
    void Select(ActionEvent event) throws IOException {
        String selectedAgent = agentSelectComboBox.getSelectionModel().getSelectedItem().toString();
        agentAbilities.getItems().clear();
        agentName.setText("");
        agentImage.setImage(null);
        agentRole.setText("");
        agentReleasePatch.setText("");

        if (selectedAgent.equals("Jett")) {
            jett();
        } else if (selectedAgent.equals("Breach")) {
            breach();
        } else if (selectedAgent.equals("Brimstone")) {
            brimstone();
        } else if (selectedAgent.equals("Cypher")) {
            cypher();
        } else if (selectedAgent.equals("Omen")) {
            omen();
        } else if (selectedAgent.equals("Phoenix")) {
            phoenix();
        } else if (selectedAgent.equals("Raze")) {
            raze();
        } else if (selectedAgent.equals("Reyna")) {
            reyna();
        } else if (selectedAgent.equals("Sage")) {
            sage();
        } else if (selectedAgent.equals("Sova")) {
            sova();
        } else if (selectedAgent.equals("Viper")) {
            viper();
        } else if (selectedAgent.equals(usersAgent.getAgentName())) {
            usersAgentInfo();
        }
    }


    private Agent breach, brimstone, cypher, jett,
            omen, phoenix, raze, reyna, sage, sova, viper;
    private Game game = new Game(1.9);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        breach = new Agent("Breach", new ArrayList<String>(), "Initiator", 1.0);
        breach.addAbilities(new String[]{"Aftershock", "Flash point", "Fault Line", "Rolling Thunder"});

        brimstone = new Agent("Brimstone", new ArrayList<String>(), "Controller", 1.0);
        brimstone.addAbilities(new String[]{"Incendiary", "Stim Beacon", "Sky Smoke", "Orbital Strike"});

        cypher = new Agent("Cypher", new ArrayList<String>(), "Sentinel", 1.0);
        cypher.addAbilities(new String[]{"Trapwire", "Cyber cage", "Spycam", "Neural Theft"});

        jett = new Agent("Jett", new ArrayList<String>(), "Duelist", 1.0);
        jett.addAbilities(new String[]{"Dash", "Smoke", "Updraft", "Blade Storm"});

        omen = new Agent("Omen", new ArrayList<String>(), "Controller", 1.0);
        omen.addAbilities(new String[]{"Shroud Step", "Paranoia", "Dark Cover", "From the Shadows"});

        phoenix = new Agent("Phoenix", new ArrayList<String>(), "Duelist", 1.0);
        phoenix.addAbilities(new String[]{"Blaze", "Curve Ball", "Hot Hands", "Run it Back"});

        raze = new Agent("Raze", new ArrayList<String>(), "Duelist", 1.0);
        raze.addAbilities(new String[]{"Boom Bot", "Blast Pack", "Paint Shells", "Showstopper"});

        reyna = new Agent("Reyna", new ArrayList<String>(), "Duelist", 1.0);
        reyna.addAbilities(new String[]{"Leer", "Devour", "Dismiss", "Empress"});

        sage = new Agent("Sage", new ArrayList<String>(), "Sentinel", 1.0);
        sage.addAbilities(new String[]{"Barrier Orb", "Slow Orb", "Healing Orb", "Resurrection"});

        sova = new Agent("Sova", new ArrayList<String>(), "Initiator", 1.0);
        sova.addAbilities(new String[]{"Owl Drone", "Shock Bolt", "Recon Bolt", "Hunter's Fury"});

        viper = new Agent("Viper", new ArrayList<String>(), "Controller", 1.0);
        viper.addAbilities(new String[]{"Snake bite", "Poison Cloud", "Toxic Screen", "Viper's Pit"});

        game.addAgent(breach);
        game.addAgent(brimstone);
        game.addAgent(cypher);
        game.addAgent(jett);
        game.addAgent(omen);
        game.addAgent(phoenix);
        game.addAgent(raze);
        game.addAgent(reyna);
        game.addAgent(sage);
        game.addAgent(sova);
        game.addAgent(viper);

        // combo box list of agents
        ObservableList<Agent> list = FXCollections.observableArrayList(game.getAgents());
        agentSelectComboBox.setItems(list);


        currentPatchLabel.setText("Current patch: " + game.getCurrentPatch());

    }

    private void usersAgentInfo() {


        agentName.setText(usersAgent.getAgentName());
        agentRole.setText(usersAgent.getRole());
        agentReleasePatch.setText(usersAgent.getReleasePatch() + "");
        agentImage.setImage(usersAgent.getAgentImage());
        agentImage.setFitHeight(310);
        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(usersAgent.getAbilities());
    }

    private void jett() {
        agentName.setText(jett.getAgentName());
        agentRole.setText(jett.getRole());
        agentReleasePatch.setText(jett.getReleasePatch() + "");
        agentImage.setImage(jett.getAgentImage());
        agentImage.setFitHeight(310);
        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(jett.getAbilities());
    }

    private void breach() {
        agentName.setText(breach.getAgentName());
        agentRole.setText(breach.getRole());
        agentReleasePatch.setText(breach.getReleasePatch() + "");
        agentImage.setImage(breach.getAgentImage());
        agentImage.setFitHeight(310);
        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(breach.getAbilities());
    }

    private void brimstone() {
        agentName.setText(brimstone.getAgentName());
        agentRole.setText(brimstone.getRole());
        agentReleasePatch.setText(brimstone.getReleasePatch() + "");
        agentImage.setImage(brimstone.getAgentImage());
        agentImage.setFitHeight(310);
        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(brimstone.getAbilities());
    }

    private void cypher() {
        agentName.setText(cypher.getAgentName());
        agentRole.setText(cypher.getRole());
        agentReleasePatch.setText(cypher.getReleasePatch() + "");
        agentImage.setImage(cypher.getAgentImage());
        agentImage.setFitHeight(310);
        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(cypher.getAbilities());
    }

    private void omen() {
        agentName.setText(omen.getAgentName());
        agentRole.setText(omen.getRole());
        agentReleasePatch.setText(omen.getReleasePatch() + "");
        agentImage.setImage(omen.getAgentImage());
        agentImage.setFitHeight(310);
        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(omen.getAbilities());
    }

    private void phoenix() {
        agentName.setText(phoenix.getAgentName());
        agentRole.setText(phoenix.getRole());
        agentReleasePatch.setText(phoenix.getReleasePatch() + "");
        agentImage.setImage(phoenix.getAgentImage());
        agentImage.setFitHeight(310);
        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(phoenix.getAbilities());
    }

    private void raze() {
        agentName.setText(raze.getAgentName());
        agentRole.setText(raze.getRole());
        agentReleasePatch.setText(raze.getReleasePatch() + "");
        agentImage.setImage(raze.getAgentImage());
        agentImage.setFitHeight(310);
        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(raze.getAbilities());
    }

    private void reyna() {
        agentName.setText(reyna.getAgentName());
        agentRole.setText(reyna.getRole());
        agentReleasePatch.setText(reyna.getReleasePatch() + "");
        agentImage.setImage(reyna.getAgentImage());
        agentImage.setFitHeight(310);
        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(reyna.getAbilities());
    }

    private void sage() {
        agentName.setText(sage.getAgentName());
        agentRole.setText(sage.getRole());
        agentReleasePatch.setText(sage.getReleasePatch() + "");
        agentImage.setImage(sage.getAgentImage());
        agentImage.setFitHeight(310);
        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(sage.getAbilities());
    }

    private void sova() {
        agentName.setText(sova.getAgentName());
        agentRole.setText(sova.getRole());
        agentReleasePatch.setText(sova.getReleasePatch() + "");
        agentImage.setImage(sova.getAgentImage());
        agentImage.setFitHeight(310);
        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(sova.getAbilities());
    }

    private void viper() {
        agentName.setText(viper.getAgentName());
        agentRole.setText(viper.getRole());
        agentReleasePatch.setText(viper.getReleasePatch() + "");
        agentImage.setImage(viper.getAgentImage());
        agentImage.setFitHeight(310);
        agentImage.setFitWidth(220);
        agentAbilities.getItems().addAll(viper.getAbilities());
    }


}