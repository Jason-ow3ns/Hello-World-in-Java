package com.company;

public class returnMethods {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your Final Score Was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your Final Score Was " +highScore);

        
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            int falseValue = -1;
            return falseValue;
        }


    }

}
