package com.LearnJava;

import java.util.Arrays;
import java.util.Scanner;

public class LoopExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        int temp =n;
        while (temp != 0)
        {
            temp = temp / 10;
            count++;
        }
        int[] arr;
        arr = new int[count];
        int i=0;
        while(n!=0)
        {
            arr[i]=n%10;
            n=n/10;
            i++;
        }
        Arrays.sort(arr);
        for(i=0;i<count;i++)
        {
            System.out.print(arr[i]);
        }
    }
    }

