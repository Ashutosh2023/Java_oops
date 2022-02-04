package com.LearnJava;
//This code here is to explain the functioning of Inner Classes.
public class Outer {
    private static int outerX;  //To use outerX in a Static inner class we need 'outerX' to be static.

    //You can use 'Public' to access Inner anywhere.
    //As we know that 'Private cannot be used on classes. But here we can use it on inner classes
    //That means that we cannot create an inner object outside the outer class. Just like outerX variable.
    static class Inner {   //Making 'Inner' class static means that it is now a part of the class it is no longer associated to object.
        public int innerX;

        void showX() {
            System.out.println(outerX + " " + innerX);
        }
    }

    public void demo() {
        Inner inner = new Inner ();
        inner.innerX = 3;
        inner.showX();
    }
}
