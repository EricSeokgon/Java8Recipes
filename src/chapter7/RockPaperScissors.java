package chapter7;

import java.util.Scanner;

/**
 * Created by hadeslee on 2016-12-20.
 */
public class RockPaperScissors {
    enum Hand {ROCK, PAPER, SCISSORS, INVALID}

    ;

    private static void getHand(int handVal) {
        Hand hand;
        try {
            hand = Hand.values()[handVal - 1];
        } catch (ArrayIndexOutOfBoundsException ex) {
            hand = Hand.INVALID;
        }
        switch (hand) {
            case ROCK:
                System.out.println("Rock");
                break;
            case PAPER:
                System.out.println("Paper");
                break;
            case SCISSORS:
                System.out.println("Scissors");
                break;
            default:
                System.out.println("Invalid");
        }
    }

    private static void playHands(int yourHand, int myHand) {
        switch ((yourHand == myHand) ? 0 : (yourHand + myHand)) {
            case 0:
                System.out.println("Draw!");
                break;
            case 3:
                System.out.println("Paper beats Rock.");
                printWinner(yourHand, 2);
                break;
            case 4:
                System.out.println("Rock beats Scissors.");
                printWinner(yourHand, 1);
                break;
            case 5:
                System.out.println("Scissors beats Paper.");
                printWinner(yourHand, 3);
            default:
                System.out.println("You cheated!");
                printWinner(yourHand, myHand);
        }
    }

    private static void printWinner(int yourHand, int winningHand) {
        if (yourHand == winningHand) {
            System.out.println("You win!");
        } else {
            System.out.println("I win!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's Play Rock, Paper, Scissors");
        System.out.println(" Enter 1 (Rock)");
        System.out.println(" Enter 2 (Paper)");
        System.out.println(" Enter 3 (Scissors)");
        System.out.println(">");

        int playerHand = input.hasNextInt() ? input.nextInt() : -99;
        int computerHand = (int) (3 * Math.random()) + 1;

        System.out.println("Your hand: (" + playerHand + ") ");
        getHand(playerHand);
        System.out.println("My hand: (" + computerHand + ") ");
        getHand(computerHand);
        playHands(playerHand, computerHand);
    }
}
