package chapter6;

import chapter5.recipe_05_04.Player;

/**
 * Project: Java8Recipes
 * FileName: PlayerFactory
 * Date: 2016-12-14
 * Time: 오후 3:35
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface PlayerFactory {
    Player createPlayer(String position,
                        int status,
                        String firstName,
                        String lastName);
}
