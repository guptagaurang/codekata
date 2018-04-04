package com.kkisiele.kata04.football;

import java.util.Comparator;
import java.util.List;

public class FootballFacade {
    private final Repository repository;

    public FootballFacade() {
        this.repository = new FileRepository();
    }

    public String findTeamWithSmallestGoalDifference() {
        List<Team> teams = repository.getAllTeams();
        teams.sort(Comparator.comparing(Team::goalDifference));
        return teams.get(0).name();
    }
}