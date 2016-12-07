package chapter5.recipe_05_14;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: Java8Recipes
 * FileName: TeamInner
 * Date: 2016-12-07
 * Time: 오전 9:50
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TeamInner {
    private Player player;
    private List<Player> playerList;
    private int size = 4;

    class Player {
        private String firstName = null;
        private String lastName = null;
        private String position = null;
        private int status = -1;

        public Player() {
        }

        public Player(String position, int status) {
            this.position = position;
            this.status = status;
        }

        protected String playerStatus() {
            String returnValue = null;

            switch (getStatus()) {
                case 0:
                    returnValue = "ACTIVE";
                    break;
                case 1:
                    returnValue = "INAVTICE";
                    break;
                case 2:
                    returnValue = "INJURY";
                    break;
                default:
                    returnValue = "ON_BENCH";
                    break;
            }
            return returnValue;
        }

        public String playerString() {
            return getFirstName() + " " + getLastName() + " - " + getPosition();
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            if (firstName.length() > 30) {
                this.firstName = firstName.substring(0, 29);
            } else {
                this.firstName = firstName;
            }
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

        @Override
        public String toString() {
            return "Player{" +
                    "firstName='" + firstName + '\'' +
                    ", position='" + position + '\'' +
                    '}';
        }
    }

    public TeamInner() {
        final int ACTIVE = 0;
        playerList = new ArrayList();
        playerList.add(constructPlayer("Josh", "Juneau", "Right Wing", ACTIVE));
        playerList.add(constructPlayer("Joe", "Blow", "Left Wing", ACTIVE));
        playerList.add(constructPlayer("Hohn", "Smith", "Center", ACTIVE));
        playerList.add(constructPlayer("Bob", "Coder", "Defense", ACTIVE));
        playerList.add(constructPlayer("Jonathan", "Gennick", "Goalie", ACTIVE));
    }

    private Player constructPlayer(String first, String last, String position, int status) {
        Player player = new Player();
        player.firstName = first;
        player.lastName = last;
        player.position = position;
        player.status = status;
        return player;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public static void main(String[] args) {
        TeamInner inner = new TeamInner();
        System.out.println("Team Roster");
        System.out.println("============");
        for (Player player : inner.getPlayerList()) {
            System.out.println(player.playerString());
        }
    }
}
