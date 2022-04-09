package com.example.valagentprofile;

import javafx.scene.image.Image;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Game {

    private double currentPatch;
    private ArrayList<Agent> agents;


    public Game(double currentPatch) {

        this.currentPatch = currentPatch;
        agents = new ArrayList<Agent>();
    }


    public void setAgents(ArrayList<Agent> agents) {
        this.agents = agents;
    }

    public double getCurrentPatch() {
        return currentPatch;
    }

    public ArrayList<Agent> getAgents() {
        return agents;
    }

    public Agent getAgents(int i) {
        return agents.get(i);
    }

    public void addAgent(Agent agent){
        agents.add(agent);
    }



}
