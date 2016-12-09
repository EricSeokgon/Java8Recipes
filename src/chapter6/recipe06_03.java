package chapter6;

import chapter5.recipe_05_04.Player;
import chapter5.recipe_05_11.Team;

import java.util.Comparator;

/**
 * Created by hadeslee on 2016-12-10.
 */
public class recipe06_03 extends Team{
    public static void main(String[] args) {
        Comparator<Player> byGoals = Comparator.comparing(Player::getGoals);

    }

}
