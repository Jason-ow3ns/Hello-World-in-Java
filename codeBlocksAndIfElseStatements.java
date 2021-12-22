package com.company;

public class codeBlocksAndIfElseStatements {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final Score Was " + finalScore);
        }

//        if (score < 500) {
//            System.out.println( "Your Score Was Greater Than 500");
//        } else if (score < 799){
//            System.out.println("Almost To 800!");
//        } else {
//            System.out.println("You Got 800 Points!");
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your Final Score Was " + finalScore);
        }

    }
}
