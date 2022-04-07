package com.example.valagentprofile;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("agent-profile-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        stage.setTitle("Agent Profiles!");
//        stage.setScene(scene);
//        stage.show();
//    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("agent-profile-view.fxml"));
        primaryStage.setTitle("Agent Profiles!");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch();

//        AgentDetails jett = new AgentDetails("Jett","Dash", "Smoke", "Daggers", "updraft");
//        System.out.println(jett.getJettAbilities());
//        System.out.println(jett.getAgent());
//        System.out.println(jett.getAbilities());
//        System.out.println(jett.getAgentList());
    }
}