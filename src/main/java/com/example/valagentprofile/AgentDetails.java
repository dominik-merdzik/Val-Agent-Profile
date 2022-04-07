package com.example.valagentprofile;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AgentDetails extends Agents  {

    public AgentDetails(String agent, String abilityOne, String abilityTwo, String abilityThree, String abilityFour) {
        super(agent, abilityOne, abilityTwo, abilityThree, abilityFour);
    }

    public List<String> getAbilities(){
        return Arrays.asList(getAbilityOne(), getAbilityTwo(), getAbilityThree(), getAbilityFour());
    }

    public List<String> getJettAbilities() {
        return Arrays.asList("Dash", "Smoke", "Daggers", "updraft");
    }




}
