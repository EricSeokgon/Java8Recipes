package chapter5.recipe_05_03;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Project: Java8Recipes
 * FileName: Statistics
 * Date: 2016-11-29
 * Time: 오전 10:45
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Statistics implements Serializable {
    //Definition for the class instance
    private static volatile Statistics instance = new Statistics();
    private List teams = new ArrayList();
}
