package com.example.valagentprofile;
import java.util.ArrayList;


public class Game {

    private double currentPatch;
    private ArrayList<Agent> agents;


    public Game(double currentPatch) {

        this.currentPatch = currentPatch;
        agents = new ArrayList<Agent>();
    }

    public Game() {
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

    public void addAgent(Agent agent) {
        agents.add(agent);
    }


}
