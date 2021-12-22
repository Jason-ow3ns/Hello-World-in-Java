package com.company;

public class returnMethodChallenge {

    public static void main(String[] args) {

        int playerPosition = (calculateHighScore(1500));
        displayHighScorePosition("Bobby", playerPosition);

        playerPosition = (calculateHighScore(900));
        displayHighScorePosition("Sam", playerPosition);

        playerPosition = (calculateHighScore(400));
        displayHighScorePosition("Josh", playerPosition);

        playerPosition = (calculateHighScore(50));
        displayHighScorePosition("Steve", playerPosition);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {


        System.out.println((playerName + " managed to get into position " + playerPosition + " on the score table."));

    }

    public static int calculateHighScore(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }

    }
}
