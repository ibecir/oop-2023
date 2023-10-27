package week5.lectures.polymorphism;

import week5.lectures.polymorphism.classes.Animal;
import week5.lectures.polymorphism.classes.Tiger;
import week5.lectures.polymorphism.classes.Turtle;

public class Start {
    /**
     * Polymorphism means many shapes. Class can do the same thing in different ways.
     * There are two types of polymorphism in Java
     * 1. Compile tile polymorphism - method overloading
     *  - Which method to call is decided by the compiler
     * 2. Run time polymorphism - method overriding
     *  - Which method to call is decided by the JVM in the run tine
     * */
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        // This is possible because of the inheritance
        Tiger tiger = new Tiger();
        tiger.eat();

        Turtle turtle = new Turtle();
        turtle.eat();

        // We are doing the same things in three different forms (eat method in three classes)
        // Method overloading and method overriding are the forms of polymorphism

        // Upcasting is done by Java implicitly
        // This means that every Tiger is an (IS A) animal as it is a Tiger is child class of Animal
        // Java allows you to treat an object of subclass as an object of its parent type
        Animal myTiger = new Tiger();
        System.out.println(myTiger);

        // myTiger.sayTigerHello(); // Not works as this is an Animal

        // Not allowed as the child class reference variable cannot instantiate the super / parent class object
        // Tiger mySecondTiger = new Animal();

        // Any subclass of Animal is allowed to be passed as a parameter
        // In combination with method overriding it will call the appropriate objects eat method
        // Without this upcasting for each object you would have to create a separate method
        doSomeAnimalStuff(tiger);
        doSomeAnimalStuff(myTiger);
        doSomeAnimalStuff(turtle);
    }

    // Question is: Why do we need the upcasting at all?
    // In the method declared below we have the parameter animal of type Animal
    // But since both the Tiger and Turtle are the animals both of these are allowed
    // to be passed as a parameter
    // The type of the variable determines the methods you can call but the specific type of the object
    // that the variable is referring to is determines which specific implementation of the method
    // will be used when called
    public static void doSomeAnimalStuff(Animal animal){
        animal.eat();

        // Downcasting is different and it does not happen automatically
        // We are saying to Java, this animal passed as the parameter is the Tiger and threat it as
        // it is the Tiger. YOU HAVE TO BE CAREFUL AS IT WILL THROW AN EXCEPTION IF YOU MISS THE CASTING
        // You can add the instanceof check

         if(animal instanceof Tiger) {
             Tiger myLocalTiger = (Tiger) animal;
             myLocalTiger.getNumOfTeeth();
         }

    }
}
