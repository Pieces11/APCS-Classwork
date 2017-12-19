
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 * Uses indexOf to find strings
 * </li><li>
 * Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 *
 * @author Laurie White
 * @version April 2012
 */
import java.util.Random;
public class Magpie2 {

    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";
        statement= statement.toLowerCase();
        if (statement.indexOf("no") >= 0
                || statement.indexOf("don't") >= 0) {
            response = "Why so negative?";
        } else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        } else if (statement.indexOf("beatbox") >= 0) {
            response = "Listen carefully: Boots and cats and boots and cats and boots and cats and boots and cats and boots and cats.";
        } else if (statement.indexOf("your") >= 0) {
            response = "We are talking about you, not me.";
        } else if (statement.indexOf("breakfast") >= 0
                || statement.indexOf("lunch") >= 0
                || statement.indexOf("dinner") >= 0
                || statement.indexOf("food") >= 0) {
            response = "You are making me hungry.";
        } else if (statement.indexOf("color") >= 0
                || statement.indexOf("blue") >= 0
                || statement.indexOf("red") >= 0
                || statement.indexOf("green") >= 0) {
            response = "Interesting, do you like " + randomColor() + "? It's my favorite color.";

        } else {
            response = getRandomResponse();
        }
        return response;
    }

    private String randomColor() {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";
       String a[]=new String[4];
       a[0]="green";
       a[1]="blue";
       a[2]="red";
       a[3]="black";
       response=a[whichResponse];
        
        /*if (whichResponse == 0) {
            response = "green";
        } else if (whichResponse == 1) {
            response = "blue";
        } else if (whichResponse == 2) {
            response = "red";
        } else if (whichResponse == 3) {
            response = "black.";
        }*/

        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
          Random rng=new Random();
        String response[]={"You don't say.","Interesting, tell me more.","Do you really think so?","Hmmm."};
        double r = rng.nextDouble();
        int whichResponse = (int) (r * response.length);

        /*if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        }*/

        return response[whichResponse];
    }
}
