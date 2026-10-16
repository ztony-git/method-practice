package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        int even = 2;
        int odd = -43;
        double positive = 1.0;
        double zero = 0.0;
        double negative = -32.4;

        System.out.println(isEven(even));
        System.out.println(isEven(odd));
        System.out.println(isPositive(positive));
        System.out.println(isPositive(zero));
        System.out.println(isPositive(negative));
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static boolean isPositive(double num) {
        return num > 0;
    }
}
