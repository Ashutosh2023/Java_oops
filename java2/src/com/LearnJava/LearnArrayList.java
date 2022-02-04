package com.LearnJava;

import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> intLi = new ArrayList<>();
        intLi.add(15);
        intLi.add(34);
        intLi.add(76);
        System.out.println(intLi);
        for(int i=0; i<intLi.size(); i++)
        {
            System.out.println(intLi.get(i));
        }
        System.out.println(intLi);
        Collections.sort(intLi);
        System.out.println(intLi);
    }
}
