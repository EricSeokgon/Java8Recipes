package chapter5.recipe_05_08;

import chapter5.recipe_05_04.Player;
import chapter5.recipe_05_06.TeamType;

import java.util.List;

/**
 * Project: Java8Recipes
 * FileName: Team
 * Date: 2016-12-01
 * Time: 오전 11:34
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Team implements TeamType {
    private List<Player> players;
    private String name = null;
    private String city = null;
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;

    public List<Player> getPlayers() {
        return players;
    }

    @Override
    public void setPlayers(List<Player> players) {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setCity(String city) {

    }

    @Override
    public String getFullName() {
        return this.name + " - " + this.city;
    }

}
