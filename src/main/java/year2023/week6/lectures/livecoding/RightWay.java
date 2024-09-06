package year2023.week6.lectures.livecoding;

import year2023.week5.lectures.abstraction.classes.Dog;

import java.util.Arrays;
import java.util.List;

class OurNewPrinter<T extends Comparable>{

}

class OurPrinter<T, K> {
    private T myCustomThing;
    private K anotherThing;
    public OurPrinter(T myCustomThing, K anotherThing) {
        this.myCustomThing = myCustomThing;
        this.anotherThing = anotherThing;
    }

    public T getMyCustomThing() {
        return myCustomThing;
    }

    public void setMyCustomThing(T myCustomThing) {
        this.myCustomThing = myCustomThing;
    }

    public K getAnotherThing() {
        return anotherThing;
    }

    public void setAnotherThing(K anotherThing) {
        this.anotherThing = anotherThing;
    }

    public void print(){
        System.out.println(this.myCustomThing + " <--> " + this.anotherThing);
    }
}

class Implementation{
    public static void main(String[] args) {
        OurPrinter<Integer, String> integerOurPrinter = new OurPrinter<>(15, "Becir");
        integerOurPrinter.print();

        OurPrinter<String, String> stringOurPrinter = new OurPrinter<>("Strings", "Another");
        stringOurPrinter.print();

        OurPrinter<String, Dog> dogOurPrinter = new OurPrinter<>("CUKICA", new Dog());
        dogOurPrinter.print();

        String myName = doSomething("Becir", 1);

        List<String> stringList = Arrays.asList("Becir", "Basar", "Adnan", "Amila");
        printObjects(stringList);

        List<Integer> integerList = Arrays.asList(1,2,3,44,5);
        printObjects(integerList);
    }

    public static void printObjects(List<?> objectList){
        for (Object o : objectList)
            System.out.println(o);
    }

    public static <T, K> T doSomething(T something, K anotherSomething){
        System.out.println("I DID IT");
        return something;
    }
}