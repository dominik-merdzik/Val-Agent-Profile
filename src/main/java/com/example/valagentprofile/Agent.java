package com.example.valagentprofile;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Agent {

    private String agentName ;
    private ArrayList<String> abilities;
    private String role;
    private double releasePatch;
    private Image agentImage;
    private String abilityOne, abilityTwo, abilityThree, abilityFour;

    public Agent(String agentName, String abilityOne, String abilityTwo, String abilityThree, String abilityFour) {
        this.agentName = agentName;
        this.abilityOne = abilityOne;
        this.abilityTwo = abilityTwo;
        this.abilityThree = abilityThree;
        this.abilityFour = abilityFour;
    }

    public Agent(String agentName, ArrayList<String> abilities, String role, double releasePatch) {
        setAgentName(agentName);
        setAbilities(abilities);
        setRole(role);
        setReleasePatch(releasePatch);
        if(getValidAgents().contains(agentName)){
            String agentPicture = "images/agent-"+agentName+".PNG";
            agentImage = new Image(getClass().getResource(agentPicture).toExternalForm());
        }
            else{
            String agentPicture = "images/logo-.PNG";
                agentImage = new Image(getClass().getResource(agentPicture).toExternalForm());
            }
    }


    public String getAgentName() {

        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }

    public void addAbilities(String[] abilities){
        this.abilities.addAll(Arrays.asList(abilities));
    }

    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getReleasePatch() {

        String strReleasePatch;


        if(releasePatch == 0.0){
            strReleasePatch = "Beta Release";

        }else{
            strReleasePatch = Double.toString(releasePatch);
        }

        return strReleasePatch;
    }

    public void setReleasePatch(double releasePatch) {
        this.releasePatch = releasePatch;
    }

    public Image getAgentImage() {
        return agentImage;
    }

    public void setAgentImage(Image agentImage) {
        this.agentImage = agentImage;
    }

    public List<String> getValidAgents() {
        return Arrays.asList( "Breach", "Brimstone", "Cypher", "Jett", "Omen", "Phoenix", "Raze", "Reyna", "Sage", "Sova", "Viper");
    }

}

