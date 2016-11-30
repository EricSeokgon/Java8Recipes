package chapter5.recipe_05_04;

/**
 * Project: Java8Recipes
 * FileName: Goalie
 * Date: 2016-11-30
 * Time: 오전 9:53
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Goalie extends Player implements PlayerType {
    private int totalSaves;

    public Goalie() {
        this.setPosition("GOALIE");
    }

    public int getTotalSaves() {
        return totalSaves;
    }

    public void setTotalSaves(int totalSaves) {
        this.totalSaves = totalSaves;
    }
}
