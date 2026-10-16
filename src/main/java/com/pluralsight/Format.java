package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        System.out.println(formatName("Zeke", "Zurita"));
    }
    public static String formatName(String first, String last) {
        return last + "," + first;
    }
}
