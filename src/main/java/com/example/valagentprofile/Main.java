package com.example.valagentprofile;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("agent-profile-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Agent Profiles!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        //launch();

        AgentDetails jett = new AgentDetails("Jett","Dash", "Smoke", "Daggers", "updraft");
        System.out.println(jett.getJettAbilities());
        System.out.println(jett.getAgent());
        System.out.println(jett.getAbilities());
        System.out.println(jett.getAgentList());
    }
}