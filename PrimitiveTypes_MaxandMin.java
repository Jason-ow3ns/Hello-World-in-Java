package com.company;

public class PrimitiveTypes_MaxandMin {

    public static void main(String[] args) {
	    int maxInteger = Integer.MAX_VALUE;
        int minInteger = Integer.MIN_VALUE;
            System.out.println("Max Integer = " + maxInteger);
            System.out.println("Min Integer = " + minInteger);
            System.out.println("Busting Max Integer = " + (maxInteger + 1));
            System.out.println("Busting Min Integer = " + (minInteger - 1));

            byte maxByte = Byte.MAX_VALUE;
            byte minByte = Byte.MIN_VALUE;
            System.out.println("Max Byte = " + maxByte);
            System.out.println("Min Byte = " + minByte);

            short maxShort = Short.MAX_VALUE;
            short minShort = Short.MIN_VALUE;
            System.out.println("Max Short = " + maxShort);
            System.out.println("Min Short = " + minShort);

            long maxLong = Long.MAX_VALUE;
            long minLong = Long.MIN_VALUE;
            System.out.println("Max Long = " + maxLong);
            System.out.println("Min Long = " + minLong);

    }
}
