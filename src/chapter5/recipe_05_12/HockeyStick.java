package chapter5.recipe_05_12;

/**
 * Project: Java8Recipes
 * FileName: HockeyStick
 * Date: 2016-12-05
 * Time: 오전 9:32
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class HockeyStick {
    public int length;
    public boolean isCurved;
    public String material;

    public HockeyStick(int length, boolean isCurved, String material) {
        this.length = length;
        this.isCurved = isCurved;
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isCurved() {
        return isCurved;
    }

    public void setCurved(boolean curved) {
        isCurved = curved;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
