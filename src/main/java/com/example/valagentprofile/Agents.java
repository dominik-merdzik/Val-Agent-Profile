package com.example.valagentprofile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Agents {
    private ArrayList<Agents> agents;
    private String agent ; //, abilityOne, abilityTwo, abilityThree, abilityFour;
    private ArrayList<String> abilities;
//    private String Astra, Breach, Brimstone, Chamber, Cypher, Jett,
//                    Kayo , Killjoy, Neon, Omen, Phoenix, Raze, Reyna,
//                    Sage, Skye, Sova , Viper, Your;


    public Agents() {
    }

    public Agents(String agent, ArrayList<String> abilities) {
        this.agent = agent;
        setAbilities(abilities);
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public ArrayList<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
    }

    public void addAbilities(String[] abilities){
        this.getAbilities().addAll(Arrays.asList(abilities));
    }

    public List<String> getAgentList() {
        return Arrays.asList("Astra", "Breach", "Brimstone", "Chamber", "Cypher", "Jett", "Kay/o"
                , "Killjoy", "Neon", "Omen", "Phoenix", "Raze", "Reyna", "Sage", "Skye", "Sova"
                , "Viper", "Your");
    }

}

