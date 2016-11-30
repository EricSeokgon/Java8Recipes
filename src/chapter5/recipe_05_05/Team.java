package chapter5.recipe_05_05;

import chapter5.recipe_05_04.Player;

import java.util.List;

/**
 * Project: Java8Recipes
 * FileName: Team
 * Date: 2016-11-30
 * Time: 오전 10:04
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Team implements TeamType {
    private List<Player> players;
    private String name = null;
    private String city = null;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
