package com.example.valagentprofile;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Agents {
    private ArrayList<Agents> agents;
    private String agent , abilityOne, abilityTwo, abilityThree, abilityFour;
    private ArrayList<String> abilities;
    private Image agentImage;
//    private String Astra, Breach, Brimstone, Chamber, Cypher, Jett,
//                    Kayo , Killjoy, Neon, Omen, Phoenix, Raze, Reyna,
//                    Sage, Skye, Sova , Viper, Your;


    public Agents(String agent, String abilityOne, String abilityTwo, String abilityThree, String abilityFour, ArrayList<String> abilities, Image agentImage) {
        this.agent = agent;
        this.abilityOne = abilityOne;
        this.abilityTwo = abilityTwo;
        this.abilityThree = abilityThree;
        this.abilityFour = abilityFour;
        this.abilities = abilities;
        String agentPicture = String.format("images/agent-%d.JPG",agent);
        agentImage = new Image(getClass().getResource(agentPicture).toExternalForm());
    }

    public Agents(String agent, String abilityOne, String abilityTwo, String abilityThree, String abilityFour) {
    }

    public Agents(String agent, ArrayList<String> abilities) {
        this.agent = agent;
        this.abilities = abilities;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getAbilityOne() {
        return abilityOne;
    }

    public void setAbilityOne(String abilityOne) {
        this.abilityOne = abilityOne;
    }

    public String getAbilityTwo() {
        return abilityTwo;
    }

    public void setAbilityTwo(String abilityTwo) {
        this.abilityTwo = abilityTwo;
    }

    public String getAbilityThree() {
        return abilityThree;
    }

    public void setAbilityThree(String abilityThree) {
        this.abilityThree = abilityThree;
    }

    public String getAbilityFour() {
        return abilityFour;
    }

    public void setAbilityFour(String abilityFour) {
        this.abilityFour = abilityFour;
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
    }

    public List<String> getAgentList() {
        return Arrays.asList("Astra", "Breach", "Brimstone", "Chamber", "Cypher", "Jett", "Kay/o"
                , "Killjoy", "Neon", "Omen", "Phoenix", "Raze", "Reyna", "Sage", "Skye", "Sova"
                , "Viper", "Your");
    }

}

