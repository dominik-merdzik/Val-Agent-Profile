package com.example.valagentprofile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Agents {
    private ArrayList<Agents> agents;
    private String agent, abilityOne, abilityTwo, abilityThree, abilityFour;
//    private String Astra, Breach, Brimstone, Chamber, Cypher, Jett,
//                    Kayo , Killjoy, Neon, Omen, Phoenix, Raze, Reyna,
//                    Sage, Skye, Sova , Viper, Your;

    public Agents() {
    }

    public Agents(String agent, String abilityOne, String abilityTwo, String abilityThree, String abilityFour) {
        this.agent = agent;
        this.abilityOne = abilityOne;
        this.abilityTwo = abilityTwo;
        this.abilityThree = abilityThree;
        this.abilityFour = abilityFour;
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

    public List<String> getAgentList() {
        return Arrays.asList("Astra", "Breach", "Brimstone", "Chamber", "Cypher", "Jett", "Kay/o"
                , "Killjoy", "Neon", "Omen", "Phoenix", "Raze", "Reyna", "Sage", "Skye", "Sova"
                , "Viper", "Your");
    }

}

