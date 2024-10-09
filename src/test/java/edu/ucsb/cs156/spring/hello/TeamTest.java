package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("f24-14");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("f24-14"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=f24-14, members=[])", team.toString());
    }

    @Test
    public void equals_test() {
        assertTrue(team.equals(team));
        assertEquals(team.equals(null), false);
        Team testTeam = new Team("f24-14");
        /*testTeam.addMember("Oviya");
        testTeam.addMember("Riona");
        testTeam.addMember("Jennifer");
        testTeam.addMember("Aman");
        testTeam.addMember("Kevin");
        testTeam.addMember("Vala");*/
        assertEquals(team.equals(testTeam), true); // true case

        // F && T case
        Team falseTeam = new Team("WRONGGGG");
        /*falseTeam.addMember("Oviya");
        falseTeam.addMember("Riona");
        falseTeam.addMember("Jennifer");
        falseTeam.addMember("Aman");
        falseTeam.addMember("Kevin");
        falseTeam.addMember("Vala");*/
        assertEquals(team.equals(falseTeam), false);

        // T && F case
        Team tfTeam = new Team("f24-14");
        tfTeam.addMember("Oviya");
        tfTeam.addMember("Riona");
        tfTeam.addMember("Jennifer");
        tfTeam.addMember("Aman");
        tfTeam.addMember("Kevin");
        tfTeam.addMember("Vala");
        assertEquals(team.equals(tfTeam), false);
    }

    @Test
    public void hashTest() {
        assertEquals(team.hashCode(), -1327023895);
    }
}
