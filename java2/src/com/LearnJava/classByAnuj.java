package com.LearnJava;

public class classByAnuj {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.name = "Ashutosh";

//        System.out.println(p1.age + " " +p1.name) ;

        Person p2 = new Person(20, "Ashutosh");
//        p2.age = 20;
//        p2.name = "Rishu";

//        p1.eat();
//        p2.eat();
//        p1.walk();
        p1.walk(50);
        p2.walk(45);

//        "variable with static keyword can be accessed without creating object as shown below."
        System.out.println("Number of times the constructor called is: "+ Person.count);
    }
}

class Person {
    String name;
    int age;

    static int count;
    public Person() {
//        System.out.println("Creating an object.");
        count++;
    }
    public Person(int newAge, String newName) {
        this();             // To call the above constructor in this constructor
        name = newName;
        age = newAge;
    }

    void walk() {
        System.out.println(name+" is walking.");
    }
    void eat() {
        System.out.println(name+" is eating.");
    }
    void walk(int steps) {
        System.out.println(name + " walked " + steps +" steps.");
    }
}
