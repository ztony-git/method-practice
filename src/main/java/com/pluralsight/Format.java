package com.pluralsight;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        String formattedName = formatName(firstName, lastName);
        System.out.println(formattedName);
        scanner.close();
    }
    public static String formatName(String f, String l) {
        return l + ", " + f;
    }
}
