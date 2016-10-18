package chapter2.recipe_02_02;

/**
 * Project: Java8Recipes
 * FileName: PoolCalculator
 * Date: 2016-10-18
 * Time: 오전 9:39
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PoolCalculator implements Volume {
    private double width;
    private double length;
    private double minDepth;
    private double maxDepth;

    public PoolCalculator() {
    }

    public PoolCalculator(double width, double length, double minDepth, double maxDepth) {
        this.width = width;
        this.length = length;
        this.minDepth = minDepth;
        this.maxDepth = maxDepth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getMinDepth() {
        return minDepth;
    }

    public void setMinDepth(double minDepth) {
        this.minDepth = minDepth;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }

    @Override
    public double calculateVolume() {
        double avgDepth = (minDepth + maxDepth) / 2;
        return avgDepth * length * width;
    }

    public double calculateGallons(Volume vol) {
        return 7.48 * vol.calculateVolume();
    }
}
