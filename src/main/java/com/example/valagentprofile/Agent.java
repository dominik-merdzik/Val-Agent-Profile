package com.example.valagentprofile;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Agent {

    private String agentName;
    private ArrayList<String> abilities;
    private String role;
    private double releasePatch;
    private Image agentImage;

    Game gameClass = new Game();

    public Agent() {
    }

    public Agent(String agentName, ArrayList<String> abilities, String role, double releasePatch) {
        setAgentName(agentName);
        setAbilities(abilities);
        setRole(role);
        setReleasePatch(releasePatch);
        imageGetter();
    }

    public void imageGetter() {
        if (getValidAgents().contains(agentName)) {
            String agentPicture = "images/agent-" + agentName + ".PNG";
            agentImage = new Image(getClass().getResource(agentPicture).toExternalForm());
        } else {
            String agentPicture = "images/blank-agent.PNG";
            agentImage = new Image(getClass().getResource(agentPicture).toExternalForm());
        }
    }

    public Agent(String agentName, ArrayList<String> abilities, String role, String releasePatch) {
        setAgentName(agentName);
        setAbilities(abilities);
        setRole(role);
        setReleasePatch(Double.parseDouble(releasePatch));
    }

    public String getAgentName() {

        return agentName;
    }

    public void setAgentName(String agentName) {

        String agentFistLetter = agentName.substring(0, 1).toUpperCase();
        agentName = agentFistLetter + agentName.substring(1);

        if (agentName.trim().length() <= 10) {
            this.agentName = agentName;
        } else {
            throw new IllegalArgumentException("Agent's name exceeds 8 characters, Please pick a shorter name!");
        }
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }

    public void addAbilities(String[] abilities) {
        // addAbilities doesn't need validation as there are many unique abilities, and they can be added in various ways
        this.abilities.addAll(Arrays.asList(abilities));
    }

    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {

        String roleFistLetter = role.substring(0, 1).toUpperCase();
        role = roleFistLetter + role.substring(1);

        if (getValidRoles().contains(role)) {
            this.role = role;
        } else {
            throw new IllegalArgumentException("Role entered is not a valid roles. Valid roles: " + getValidRoles());
        }

    }

    public String getReleasePatch() {
        String strReleasePatch;
        if (releasePatch == 1.0) {
            strReleasePatch = "Beta Release Agent";

        } else {
            strReleasePatch = Double.toString(releasePatch);
        }
        return strReleasePatch;
    }

    public void setReleasePatch(double releasePatch) {
        if (releasePatch < 4.5) {

            this.releasePatch = releasePatch;
        } else {
            throw new IllegalArgumentException("We are currently on patch " + gameClass.getCurrentPatch() + " your agent can't be made on a future greater than patch 4.5");
        }
    }

    public Image getAgentImage() {
        return agentImage;
    }

    public List<String> getValidAgents() {
        return Arrays.asList("Breach", "Brimstone", "Cypher", "Jett", "Omen", "Phoenix", "Raze", "Reyna", "Sage", "Sova", "Viper");
    }

    public List<String> getValidRoles() {
        return Arrays.asList("Duelist", "Sentinel", "Controller", "Initiator");
    }

    public String toString() {
        return agentName;
    }

}

