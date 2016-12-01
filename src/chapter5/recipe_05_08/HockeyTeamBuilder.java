package chapter5.recipe_05_08;

import chapter5.recipe_05_04.PlayerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: Java8Recipes
 * FileName: HockeyTeamBuilder
 * Date: 2016-12-01
 * Time: 오후 3:59
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class HockeyTeamBuilder implements TeamBuilder {
    private Team team;

    public HockeyTeamBuilder() {
        this.team = new Team();
    }

    @Override
    public void buildPlayerList() {
        List players = new ArrayList();
        for (int x = 0; x < 10; x++) {
            players.add(PlayerFactory.getPlayer());
        }
        team.setPlayers(players);
    }

    @Override
    public void buildNewTeam(String teamName) {
        team.setName("The Java 8 Team");
    }

    @Override
    public void designateTeamCity(String city) {

    }

    @Override
    public Team getTeam() {
        return this.team;
    }

    public Team createTeam(String teamName, String city) {
        TeamBuilder builder = new HockeyTeamBuilder();
        builder.buildNewTeam(teamName);
        builder.designateTeamCity(city);
        builder.buildPlayerList();
        return builder.getTeam();
    }
}
