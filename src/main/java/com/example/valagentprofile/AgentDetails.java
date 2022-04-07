package com.example.valagentprofile;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AgentDetails extends Agents  {

    public AgentDetails(String agent, ArrayList<String> abilities) {
        super(agent, abilities);
    }


//    public ArrayList<String> getAbilities(){
//        return getAbilityOne() getAbilityTwo(), getAbilityThree(), getAbilityFour();
//    }

    public List<String> getJettAbilities() {
        return Arrays.asList("Dash", "Smoke", "Daggers", "updraft");
    }

    public void addAbilities(String[] abilities){
        this.getAbilities().addAll(Arrays.asList(abilities));
    }
    public ArrayList<String> getAgentAbilities() {
        return getAbilities();
    }


    public List<String> getAgentList() {
        return Arrays.asList("Astra", "Breach", "Brimstone", "Chamber", "Cypher", "Jett", "Kay/o"
                , "Killjoy", "Neon", "Omen", "Phoenix", "Raze", "Reyna", "Sage", "Skye", "Sova"
                , "Viper", "Your");
    }

}
