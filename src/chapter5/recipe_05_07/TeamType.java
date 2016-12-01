package chapter5.recipe_05_07;

import chapter5.recipe_05_04.Player;

import java.util.List;

/**
 * Project: Java8Recipes
 * FileName: TeamType
 * Date: 2016-12-01
 * Time: 오전 11:30
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface TeamType {
    List<Player> getPlayers();

    void setPlayers(List<Player> players);

    void setName(String name);

    void setCity(String city);

    String getFullName();

    default void listPlauers() {
        getPlayers().stream().forEach(player -> {
            System.out.println(player.getFirstName() + " " + player.getLastName());
        });
    }
}
