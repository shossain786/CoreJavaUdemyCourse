package org.saddy;

public class Hello {
    static String name = "Saddam";

    public void displayName() {
        System.out.println("My Name is Saddam");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        printName();
    }

    public static void printName() {
        System.out.println("My Name is: " + name);
    }
}

class Calculator{
    public void sum(int num1, int num2) {
        System.out.println(num1+num2);
    }
}