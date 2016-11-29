package chapter5.recipe_05_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: Java8Recipes
 * FileName: StatisticsSingleton
 * Date: 2016-11-29
 * Time: 오전 11:11
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public enum StatisticsSingleton {
    INSTANCE;
    private List teams = new ArrayList();

    public List getTeams() {
        return teams;
    }

    public void setTeams(List teams) {
        this.teams = teams;
    }
}
