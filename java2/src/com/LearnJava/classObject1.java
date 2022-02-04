package com.LearnJava;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class classObject1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        for( int i=0; i<t; i++) {
            long n = input.nextLong();
            if (n < -(int) Math.pow(2, 63) && n > (int) Math.pow(2, 63) - 1) {
                System.out.println(n + " can't be fitted anywhere.");
            } else {
                System.out.println(n + " can be fitted in:");
                if (n > -128 && n < 128) {
                    System.out.println("* byte");
                }
                if (n > -(int) Math.pow(2, 15) && n < (int) Math.pow(2, 15)) {
                    System.out.println("* short");
                }
                if (n > -(int) Math.pow(2, 31) && n < (int) Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }
                if (n > -(int) Math.pow(2, 64) && n < (int) Math.pow(2, 64) - 1) {
                    System.out.println("* long");
                }
            }
        }
    }
}
