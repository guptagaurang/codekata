package com.kkisiele.kata04.football;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FileRepositoryTest {
    private FileRepository repository;

    @Before
    public void setUp() {
        repository = new FileRepository();
    }

    @Test
    public void testGetAllTeams() {
        Assert.assertEquals(20, repository.getAllTeams().size());
        Team team = repository.getAllTeams().get(19);
        Assert.assertEquals("Leicester", team.name());
        Assert.assertEquals(30, team.scoredGoals());
        Assert.assertEquals(64, team.concededGoals());
    }
}