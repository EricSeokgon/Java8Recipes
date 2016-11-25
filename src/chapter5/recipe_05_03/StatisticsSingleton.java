package chapter5.recipe_05_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hadeslee on 2016-11-26.
 */
public enum  StatisticsSingleton {
    INSTANCE;

    private List team = new ArrayList();

    public List getTeam() {
        return team;
    }

    public void setTeam(List team) {
        this.team = team;
    }
}
