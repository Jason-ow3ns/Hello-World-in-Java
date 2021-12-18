package com.company;

public class floatingPointPrecisionChallenge {

    public static void main(String[] args) {

        double bodyWeightInLb = 168.5D;
        double bodyWeightInKg = (bodyWeightInLb * 0.45359237);
        System.out.println("Jason weighs " + bodyWeightInLb + ("lbs, which is equal to " + bodyWeightInKg + "kg."));

    }
}
