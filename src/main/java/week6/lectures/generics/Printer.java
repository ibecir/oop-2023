package week6.lectures.generics;

import java.util.ArrayList;
import java.util.List;

// The T is the type that this class may hold and use
class Printer<T,K> {
    private T thingToPrint; // Totally unaware what T will become
    private K anotherThing;
    // Generic type, anything we want
    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public T getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public K getAnotherThing() {
        return anotherThing;
    }

    public void setAnotherThing(K anotherThing) {
        this.anotherThing = anotherThing;
    }

    public void print() {
        System.out.println(this.thingToPrint);
    }
}

// Generics do not work with the primitive types
class Starter {
    public static void main(String[] args) {
        Printer<String, Integer> printer = new Printer<>("Becir");
        printer.print();

        Printer<Integer, String> integerPrinter = new Printer<>(10);
        integerPrinter.print();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);

        // Why don't we create an arraylist of Objects?
        // Totally legit but not type safe at all
        List<Object> tigers = new ArrayList<>();
        tigers.add(new Tiger());
        tigers.add(new Lion());

        // Tiger tiger = tigers.get(0); // Type mismatch, Java threats this as an object
        Tiger tiger = (Tiger) tigers.get(0); // Dangerous as we have to be sure that it is a Tiger
        // Tiger secondTiger = (Tiger) tigers.get(1); // Will fail because the second element is the Lion

        // Will not work as our SpecificPrinter has to be a class that extends the Animal class
        // SpecificPrinter<Integer> integerSpecificPrinter = new SpecificPrinter<Integer>();
        SpecificPrinter<Animal> integerSpecificPrinter = new SpecificPrinter<Animal>(new Tiger());
        integerSpecificPrinter.getThingToPrint();

        shout("Becir", 123);
        shout(123, new Lion());
        shout(new Tiger(), new Lion());

        // Will not work
        List<Integer> integers = new ArrayList<>();
        integers.add(3);

        // printListWrongWay(integers);
        printList(integers);
    }

    // We can also have the generic methods
    public static <T> void shout(T thingToSayLoud){
        System.out.println(thingToSayLoud + "!!");
    }

    public static <T, K> void shout(T thingToSayLoud, K oneMoreThingToSayLoud){
        System.out.println(thingToSayLoud + " " + oneMoreThingToSayLoud + "!!");
    }

    public static <T, K> T returnFirstGeneric(T thingToReturn, K thingToPrint){
        System.out.println(thingToPrint + "????????");
        return thingToReturn;
    }

    // Java wildcard generics, accepts the list of any type and prints its values
    public static void printListWrongWay(List<Object> objects){
        System.out.println(objects);
    }

    public static void printList(List<?> objects){
        System.out.println(objects);
    }

    public static void printListSpecific(List<? extends Animal> objects){
        System.out.println(objects);
    }
}

