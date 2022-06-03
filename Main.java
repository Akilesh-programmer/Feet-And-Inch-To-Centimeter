package com.akilesh;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(5, 8));
        System.out.println(calcFeetAndInchesToCentimeters(68));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double feetToCm;
        double inchToCm;
        double finalCm;

        boolean isFeetValid = (feet >= 0) ? true : false;
        boolean isInchValid = (inches >= 0) ? true : false;

        if((!isInchValid) || (!isFeetValid)) {
            System.out.println("Invalid values given in arguments.");
            return -1;
        }

        feetToCm = feet * 30.48d;
        inchToCm = inches * 2.54d;
        finalCm = feetToCm + inchToCm;
        return finalCm;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        double inchToFeet;
        double feetToCm;

        boolean isInchValid = (inches >= 0) ? true : false;
        if(!isInchValid) {
            System.out.println("Invalid value given in arguments.");
            return -1;
        }
        inchToFeet = inches / 12d;
        feetToCm = calcFeetAndInchesToCentimeters(inchToFeet, 0);
        return feetToCm;
    }
}
