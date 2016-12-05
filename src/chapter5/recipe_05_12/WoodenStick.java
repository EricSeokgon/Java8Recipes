package chapter5.recipe_05_12;

/**
 * Project: Java8Recipes
 * FileName: WoodenStick
 * Date: 2016-12-05
 * Time: 오전 9:35
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class WoodenStick extends HockeyStick {
    public static final String material = "WOOD";
    public int lie;
    public int flex;

    public WoodenStick(int length, boolean isCurved, String material) {
        super(length, isCurved, material);
    }

    public WoodenStick(int length, boolean isCurved, String material, int lie, int flex) {
        super(length, isCurved, material);
        this.lie = lie;
        this.flex = flex;
    }
}
