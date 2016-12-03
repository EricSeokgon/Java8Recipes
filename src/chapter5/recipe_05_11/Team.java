package chapter5.recipe_05_11;


import chapter5.recipe_05_04.Player;
import chapter5.recipe_05_07.TeamType;

import java.util.List;

/**
 * Created by hadeslee on 2016-12-04.
 */
public class Team implements TeamType, Cloneable {

    private static List<Player> playerList;
    private List<Player> players;
    private String name;
    private String city;
    private volatile int cachedhashCode = 0;

    @Override
    public List<Player> getPlayers() {
        return players;
    }

    @Override
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    public int getCachedhashCode() {
        return cachedhashCode;
    }

    public void setCachedhashCode(int cachedhashCode) {
        this.cachedhashCode = cachedhashCode;
    }

    @Override
    public String getFullName() {
        return this.name + " - " + this.city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Team) {
            Team other = (Team) obj;
            return other.getName().equals(this.getName())
                    && other.getCity().equals(this.getCity())
                    && other.getPlayers().equals(this.getPlayers());
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hashCode = cachedhashCode;
        if (hashCode == 0) {
            String concatStrings = name + city;
            if (players.size() > 0) {
                for (Player player : players) {
                    concatStrings = concatStrings
                            + player.getFirstName()
                            + player.getLastName()
                            + player.getPosition()
                            + String.valueOf(player.getStatus());
                }
            }
            hashCode = concatStrings.hashCode();
        }
        return hashCode;
    }

    public static void main(String[] args) {
        // Compare if two objects contain the same values
        Team team1 = new Team();
        Team team2 = new Team();
        // Build Player List
        Player newPlayer = new Player("Josh", "Juneau");

        playerList.add(0, newPlayer);
        newPlayer = new Player("Jonathan", "Gennick");
        playerList.add(1, newPlayer);
        newPlayer = new Player("Joe", "Blow");
        playerList.add(1, newPlayer);
        newPlayer = new Player("John", "Smith");
        playerList.add(1, newPlayer);
        newPlayer = new Player("Paul", "Bunyan");
        playerList.add(1, newPlayer);
        team1.setName("Jokers");
        team1.setCity("Crazyville");
        team1.setPlayers(playerList);
        team2.setName("Jokers");
        team2.setCity("Crazyville");
        team2.setPlayers(playerList);

        if (team1.equals(team2)){
            System.out.println("These object references contain the same values.");
        } else {
            System.out.println("These object references do NOT contain the same values.");
        }

    }
}
