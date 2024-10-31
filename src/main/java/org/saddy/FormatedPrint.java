package org.saddy;

import java.util.ArrayList;

public class FormatedPrint {
    public static void main(String[] args) {
       printWithFormat("Java", "Python");
       printWithoutFormat("Java", "Python");
    }

    static void printWithFormat(String actual, String expected) {
        System.out.printf("Expected: %s but found: %s\n", expected, actual);
    }

    static void printWithoutFormat(String actual, String expected) {
        System.out.println("Expected: " + expected + " but found: " + actual);
    }
}
