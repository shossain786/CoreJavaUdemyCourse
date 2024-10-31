package org.saddy;

import java.util.ArrayList;

public class VarKeyword {
    public static void main(String[] args) {
        int age = 20;
        String text = "Automation QA World";
        normalList(text, age);
        varKeyword(text, age);
    }

    static void normalList(String text, int age){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(text);
//        arrayList.add(age);  //not allowed to store different data type
        System.out.println(arrayList);
    }

    static void varKeyword(String text, int age) {
        var myList = new ArrayList<>();
        myList.add(text);
        myList.add(age);

        System.out.println(myList);
    }
}
