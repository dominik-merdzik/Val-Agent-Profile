package com.example.valagentprofile;

import javafx.scene.image.Image;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AgentTest {

    private Agent agent;
    private Image agentImage;

    @BeforeEach
    void setUp() {

        agent = new Agent("Jett", new ArrayList<String>(), "Duelist", "1.0");
//        agent.addAbilities(new String[]{"Dash", "Smoke", "Updraft", "Blade Storm"});

    }

    @Test
    void setAgentName() {
        agent.setAgentName("jett");
        assertEquals("Jett", agent.getAgentName());
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            agent.setAgentName("jetttttttttttttttttttttt");
        });
    }

    @Test
    void addAbilities() {
        agent.addAbilities(new String[]{"Dash", "Smoke", "Updraft", "Blade Storm"});
        List<String> agentAbilities = Arrays.asList("Dash", "Smoke", "Updraft", "Blade Storm");
        assertEquals(agentAbilities, agent.getAbilities());
    }

    @Test
    void setAbilities() {
        ArrayList<String> agentAbilities = new ArrayList<String>();
        agentAbilities.add("Dash");
        agentAbilities.add("Smoke");
        agentAbilities.add("Updraft");
        agentAbilities.add("Blade Storm");
        agent.setAbilities(agentAbilities);
        assertEquals(agentAbilities, agent.getAbilities());
    }

    @Test
    void setRole() {
        agent.setRole("duelist");
        assertEquals("Duelist", agent.getRole());
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            agent.setRole("a cool role");
        });
    }

    @Test
    void setReleasePatch() {
        agent.setReleasePatch(1.4);
        assertEquals("1.4", agent.getReleasePatch());
        agent.setReleasePatch(1.0);
        assertEquals("Beta Release Agent", agent.getReleasePatch());
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            agent.setReleasePatch(5.6);
        });
    }


    @Test
    void getValidAgents() {
        List<String> validAgents = Arrays.asList("Breach", "Brimstone", "Cypher", "Jett", "Omen", "Phoenix", "Raze", "Reyna", "Sage", "Sova", "Viper");
        assertEquals(validAgents, agent.getValidAgents());
    }

    @Test
    void getValidRoles() {
        List<String> validRoles = Arrays.asList("Duelist", "Sentinel", "Controller", "Initiator");
        assertEquals(validRoles, agent.getValidRoles());
    }

    @Test
    void testToString() {
        String agentString = agent.toString();
        assertEquals("Jett", agent.toString());
    }
}