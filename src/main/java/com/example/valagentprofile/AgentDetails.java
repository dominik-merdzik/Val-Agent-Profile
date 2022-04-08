package com.example.valagentprofile;

import javafx.scene.image.Image;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AgentDetails extends Agents  {

    private Image agentImage;


//    public AgentDetails(String agent, String abilityOne, String abilityTwo, String abilityThree, String abilityFour) {
//        super(agent, abilityOne, abilityTwo, abilityThree, abilityFour);
//    }


    public AgentDetails(String agent, ArrayList<String> abilities) {
        super(agent, abilities);

    }

    public List<String> getJettAbilities() {
        return Arrays.asList("Dash", "Smoke", "Daggers", "updraft");
    }

    public Image getAgentImage(){
        String agentPicture = String.format("images/agent-%d.JPG",getAgent());
        agentImage = new Image(getClass().getResource(agentPicture).toExternalForm());

        return agentImage;
    }



    public List<String> getAgentList() {
        return Arrays.asList("Astra", "Breach", "Brimstone", "Chamber", "Cypher", "Jett", "Kay/o"
                , "Killjoy", "Neon", "Omen", "Phoenix", "Raze", "Reyna", "Sage", "Skye", "Sova"
                , "Viper", "Your");
    }

}
