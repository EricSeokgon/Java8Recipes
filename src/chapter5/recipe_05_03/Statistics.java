package chapter5.recipe_05_03;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hadeslee on 2016-11-26.
 */
public class Statistics implements Serializable {
    //Definition for the class instance
    private static volatile Statistics instance = new Statistics();

    private List teams = new ArrayList();

    public Statistics() {
    }

    public static Statistics getInstance() {
        synchronized (Statistics.class) {
            if (instance == null) {
                instance = new Statistics();
            }
        }
        return instance;
    }

    public List getTeams() {
        return teams;
    }

    public void setTeams(List teams) {
        this.teams = teams;
    }

    protected Object readResolve() {
        return instance;
    }
}

