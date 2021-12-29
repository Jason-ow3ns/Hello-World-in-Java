package com.company;

public class EqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 2, 1);
    }

    public static void printEqual(int valOne, int valTwo, int valThree) {
        if (valOne < 0 || valTwo < 0 || valThree < 0) {
            System.out.println("Invalid Value");
        } else if (valOne == valTwo && valOne == valThree) {
            System.out.println("All numbers are equal");
        } else if (valOne != valTwo && valTwo != valThree && valOne != valThree) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}
