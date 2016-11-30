package chapter5.recipe_05_06;

import chapter5.recipe_05_04.Player;

import java.util.List;

/**
 * Project: Java8Recipes
 * FileName: TeamType
 * Date: 2016-11-30
 * Time: 오전 10:06
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface TeamType {
    void setPlayers(List<Player> players);

    void setName(String name);

    void setCity(String city);

    String getFullName();
}
