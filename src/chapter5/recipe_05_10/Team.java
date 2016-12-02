package chapter5.recipe_05_10;


import chapter5.recipe_05_04.Player;
import chapter5.recipe_05_07.TeamType;

import java.io.*;
import java.util.List;

/**
 * Project: Java8Recipes
 * FileName: Team
 * Date: 2016-12-02
 * Time: 오전 10:02
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Team implements TeamType, Cloneable, Serializable {
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getFullName() {
        return this.name + " - " + this.city;
    }

    @Override
    public List<Player> getPlayers() {
        return null;
    }

    @Override
    public void setPlayers(List<Player> players) {

    }

    public java.lang.Object clone() {
        Object obj = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            oos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            obj = ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public Object shallowCopyClone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
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
                    && other.getCity().equals(this.getCity());
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Team team1 = new Team();
        Team team2 = new Team();

        team1.setCity("Busan");
        team1.setName("hadesyi");

        team2.setCity("Seoul");
        team2.setName("daye");

        Team team3 = team1;
        Team team4 = (Team) team2.clone();

        Team team5 = (Team) team1.shallowCopyClone();

        System.out.println("Team 3:");
        System.out.println(team3.getCity());
        System.out.println(team3.getName());

        System.out.println("Team 4:");
        System.out.println(team4.getCity());
        System.out.println(team4.getName());

        team1.setCity("St. Haeundae");
        team2.setCity("Busan");

        System.out.println("Team 3:");
        System.out.println(team3.getCity());
        System.out.println(team3.getName());

        System.out.println("Team 4:");
        System.out.println(team4.getCity());
        System.out.println(team4.getName());

        System.out.println("Team 5:");
        System.out.println(team5.getCity());
        System.out.println(team5.getName());

        if (team1 == team3) {
            System.out.println("team1 and team3 are equal");
        } else {
            System.out.println("team1 and team3 are NOT equal");
        }
        if (team1 == team5) {
            System.out.println("team1 and team4 are equal");
        } else {
            System.out.println("team1 and team5 are NOT equal");
        }
    }
}
