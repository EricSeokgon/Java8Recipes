package chapter5.recipe_05_13;

import chapter5.recipe_05_11.Team;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project: Java8Recipes
 * FileName: Schedule
 * Date: 2016-12-06
 * Time: 오전 10:12
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public abstract class Schedule {
    public String scheduleYear;
    public String teamName;
    public List<Team> teams;
    public List homeGames;
    public List awayGames;
    Map gameMap;

    public Schedule() {
    }

    public Schedule(String teamName) {
        this.teamName = teamName;
    }

    public Map obtainSchedule() {
        if (gameMap == null) {
            gameMap = new HashMap();
        }
        return gameMap;
    }

    public void setGameDate(Team team, Date date) {
        obtainSchedule().put(team, date);
    }

    abstract void calculateDayPlayed(int month);
}
