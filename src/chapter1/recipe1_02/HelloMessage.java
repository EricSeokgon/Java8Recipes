package chapter1.recipe1_02;

/**
 * Created by hadeslee on 2016-10-03.
 */
/* An object of this class will hold the message. */
class HelloMessage {
    private String message = "";
    public HelloMessage() {
        this.message = "Default Message";
    }
    public void setMessage (String m) {
        this.message = m;
    }
    public String getMessage () {
        return this.message.toUpperCase();
    }
}

