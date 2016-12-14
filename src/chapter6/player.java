package chapter6;

/**
 * Created by hadeslee on 2016-12-13.
 */
public class player {
    private String firsName = null;
    private String lastName = null;
    private String position = null;
    private int status = -1;
    private int goal;

    public player() {
    }

    public player(String firsName, String lastName, String position, int status) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.position = position;
        this.status = status;
    }

    protected String playerStatus() {
        String returnValue = null;

        switch (getStatus()) {
            case 0:
                returnValue = "ACTIVE";
            case 1:
                returnValue = "INACTIVE";
            case 2:
                returnValue = "INJURY";
            default:
                returnValue = "ON_BENCH";
        }
        return returnValue;
    }
    public String playerString(){
        return getFirstName() + " " + getLastName() + " - " + getPosition();
    }

    public static int compareByGOal(player a, player b) {
        int eval;
        if (a.getGoals() > b.getGoals()) {
            eval = 1;
        } else if (a.getGoals() < b.getGoals()) {
            eval = -1;
        } else {
            eval = 0;
        }
        return eval;
    }
}
