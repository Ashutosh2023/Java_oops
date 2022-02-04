package com.LearnJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Circle c1 = new Circle();
//        System.out.println("The radius of the circle is: " + c1.radius);

        //Outer.java Class code is here.
//        Outer outer = new Outer();
//        outer.demo(); //0 3

            //Now how to create an inner object.
//        Outer outer = new Outer();
//        Outer.Inner inner = outer.new Inner();
//        inner.innerX = 5;
//        inner.showX();//0 5

            //Now how to create an Inner object when the Inner class is 'static'.
        //The above code will throw an error because we are trying to access Inner using 'outer' object
        //and since making the inner class makes it no longer associated with the object it is now a part of the class.
        //so use this method to instantiate an inner object of a static inner class.
        Outer.Inner inner = new Outer.Inner();

        inner.innerX = 5;
        inner.showX();
    }
}
