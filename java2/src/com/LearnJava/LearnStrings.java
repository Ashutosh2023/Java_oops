package com.LearnJava;

import java.util.Scanner;

public class LearnStrings {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//
//        String str = scan.next();
//        String s2 = str.toUpperCase();
//        System.out.println("myString is: "+s2);
//        immutableStrings();
//        nameScanner();
    }


    public static void immutableStrings() {
        String string = new String("old value");
        string = "new value";
        System.out.println(string);
    }
    public static void nameScanner() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        System.out.println("Your name is: " + input.next());
    }
}
