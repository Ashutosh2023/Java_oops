package com.LearnJava;

import java.awt.*;

public class NesoClass {
    public static void main(String[] args) {
        Circle c1 = new Circle();  //Here there is no Error as an empty/Zero argument constructor has been created.

        //INITIALIZING AN OBJECT:
        //METHOD 1: Using '.' dot operator.
        //c1.center = new Point(0,0); //Assignment will not work ....
        //c1.radius = 3.0; //..... when private access modifier is used

        //METHOD 2: Using methods.
        //So we use methods to set the value of the operators.
        //c1.setCenter (new Point(0, 0));
        //c1.setRadius ( 3.0 );

        System.out.println("The number of Circles are: " + c1.getNumberOfCircles());
//        c1.numberOfCircles = 10; // This will change the value of the static variable 'numberOfCircles'
                                    //for all the object as a static variable belong to a class not to any object.
        //METHOD 3: Using Constructor.
        Circle c2 =  new Circle(new Point(0,0), 3.0);

        System.out.println("The Perimeter of the circle is: " + c2.getPerimeter() + ".");
        System.out.println("The Area of the circle is: " + c2.getArea() + ".");

//        System.out.println("The number of Circles are: " + Circle.numberOfCircles);    //cannot use '.' when private is used
//        System.out.println("The number of Circles are: " + c2.numberOfCircles);
        System.out.println("The number of Circles are: " + Circle.getNumberOfCircles());
        System.out.println("The number of Circles are: " + c1.getNumberOfCircles());
    }
}

class Circle {
    Point center;   //These variable are called attributes or instance variables.
    Double radius;   //As these can be accessed anywhere inside the class.

    //STATIC VARIABLE
    //If an object modifies the static variable, all objects of the same class is affected.
    //A static variable can be accessed without creating an instance of the class.
    //A static method can be called using the same way (by an object or the class itself).
    // A static method cannot access instance variables or methods.
    private static int numberOfCircles;  //A Static variable for The class to keep track of Circles. //using 'private' will encapsulate 'numberOfCircles'


    //CONSTRUCTOR
    //has the same name as the class and is used to initialize objects.
    //does not have a return type.
    //default constructor is a zero argument constructor with and empty body.
    //it is invoked use the 'new' operator.
    Circle(Point center, double radius) {
        numberOfCircles++;
        this.center = center;
        this.radius = radius;
    }
    //Create an empty/(Zero argument) constructor, if you don't want to use the above constructor.
    //This will also help with the error cause using just "Circle c1 = new Circle();"
    //it will show that two argument were supposed to be in the 'Circle(~)'
    //So, if you want to simply use just "Circle c1 = new Circle();" DO THIS:
    Circle () {
        numberOfCircles++;
        center = new Point(0,0);  // if The user doesn't want to give value
        radius = 5.0;                   // it will give default values to the object.
    }

    //Creating a Static method to access the static variable 'numberOfCircles'
    static int getNumberOfCircles() {return numberOfCircles;}

    public void setCenter(Point center) {
        this.center = center;
    }
    public void setRadius(Double radius) {
        this.radius = (radius>=0) ? radius:0;
    }
    public Double getArea() {
        return Math.PI * radius * radius;
    }
    public Double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
