package com.company;

public class operatorChallenge {

    public static void main(String[] args) {

        double firstVariable = 20;

        double secondVariable = 80;

        double thirdVariable = ((firstVariable + secondVariable) * 100);

        double fourthVariable = thirdVariable % 40;

        boolean fifthVariable = fourthVariable == 0 ? true : false;
        System.out.println(fifthVariable);

        if (fifthVariable == false) {
            System.out.println("Got Some Remainder");
        }


    }
}
