package chapter5.recipe_05_13;

/**
 * Project: Java8Recipes
 * FileName: TeamSchedule
 * Date: 2016-12-06
 * Time: 오전 10:18
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TeamSchedule extends Schedule {
    public TeamSchedule(String teamName) {
        super(teamName);
    }

    @Override
    void calculateDayPlayed(int month) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
