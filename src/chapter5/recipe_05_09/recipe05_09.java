package chapter5.recipe_05_09;


import chapter5.recipe_05_06.TeamType;
import chapter5.recipe_05_08.Team;

/**
 * Created by hadeslee on 2016-12-02.
 */
public class recipe05_09 extends Team {

    public static void main(String[] args) {
        TeamType team = new Team();
        team.setName("hadesYI");
        team.setCity("Busan");
        System.out.println(team.getFullName());
    }

}
