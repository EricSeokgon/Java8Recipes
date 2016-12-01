package chapter5.recipe_05_08;

/**
 * Project: Java8Recipes
 * FileName: TeamBuilder
 * Date: 2016-12-01
 * Time: 오후 1:40
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface TeamBuilder {
    public void buildPlayerList();

    public void buildNewTeam(String teamName);

    public void designateTeamCity(String city);

    public Team getTeam();




}
