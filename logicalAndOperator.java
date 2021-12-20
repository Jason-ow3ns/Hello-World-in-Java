package com.company;

public class logicalAndOperator {

    public static void main(String[] args) {

        int topScore = 80;
        if (topScore > 50) {
            System.out.println("Nice Score!");
        }

        int secondScore = 82;
        if ((secondScore > topScore) && (secondScore > 50)) {
            System.out.println("New High Score!");
        }

        int thirdScore = 81;
        if ((thirdScore > 80) || (thirdScore > secondScore)){
            System.out.println("Great Job!");
        }

        /*

        int newValue = 50;
        if (newValue = 50) {
            System.out.println("This is an error.");
        }

        */

        int newValue = 51;
        if (newValue == 51) {
            System.out.println("This is not an error.");
        }

        boolean thisWork = true;
        if (thisWork) {
            System.out.println("This works");
        }

        if (!thisWork) {
            System.out.println("This works");
        }


    }
}
