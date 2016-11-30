package chapter5.recipe_05_04;

/**
 * Project: Java8Recipes
 * FileName: PlayerFactory
 * Date: 2016-11-30
 * Time: 오전 9:48
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class PlayerFactory {
    public static Player createPlayer(String playerType) {
        Player returnType;
        switch (playerType) {
            case "GOALIE":
                returnType = new Goalie();
                break;
            case "LEFT":
                returnType = new LeftWing();
                break;
            case "RIGHT":
                returnType = new RightWing();
                break;
            case "CENTER":
                returnType = new Center();
                break;
            case "DEFENSE":
                returnType = new Defense();
                break;
            default:
                returnType = new AllPlayer();
        }
        return returnType;
    }
}


