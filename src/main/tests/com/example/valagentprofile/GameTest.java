package com.example.valagentprofile;

import javafx.scene.image.Image;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Agent agent;
    private Game game;
    private Image agentImage;

    @BeforeEach
    void setUp() {

        agent = new Agent("Jett", new ArrayList<String>(), "Duelist", "1.0");
//        agent.addAbilities(new String[]{"Dash", "Smoke", "Updraft", "Blade Storm"});
        game = new Game(1.9);

    }

    @Test
    void setAgents() {
        agent.setAgentName("jett");
        assertEquals("Jett", agent.getAgentName());
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            agent.setAgentName("jetttttttttttttttttttttt");
        });
    }

    @Test
    void getCurrentPatch() {
        assertEquals(1.9, game.getCurrentPatch());
    }

}