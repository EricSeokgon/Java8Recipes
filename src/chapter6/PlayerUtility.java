package chapter6;

/**
 * Project: Java8Recipes
 * FileName: PlayerUtility
 * Date: 2016-12-14
 * Time: 오후 3:34
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PlayerUtility {
    public int compareByGoal(Player a, Player b){
        int eval;
        if(a.getGoals() > b.getGoals()){
            eval = 1;
        } else if (a.getGoals() < b.getGoals()){
            eval = -1;
        } else {
            eval = 0;
        }
        return eval;
    }
}
