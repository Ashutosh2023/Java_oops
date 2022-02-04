package com.LearnJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LearnMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 4; i++) {
//            String name = input.next();
//            printName(name);
//        }
        System.out.println("Enter two numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println("The sum of the two numbers "+ x +" and "+ y +" is: "+ average(x, y));
    }
    static double average(int x, int y){
        double avg = (x+y)/2;
        return avg;
    }

    static void printName(String name) {

        System.out.println("Your name is: " + name);
    }
}