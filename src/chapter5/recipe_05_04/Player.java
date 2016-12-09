package chapter5.recipe_05_04;

/**
 * Project: Java8Recipes
 * FileName: Player
 * Date: 2016-11-30
 * Time: 오전 9:57
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    private String firstName = null;
    private String lastName = null;
    private String position = null;
    private int status = -1;

    public Player(String josh, String juneau) {

    }

    public Player() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static <U extends Comparable<? super U>, T> U getGoals(T t) {
        return null;
    }
}
