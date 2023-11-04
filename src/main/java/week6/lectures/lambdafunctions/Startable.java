package week6.lectures.lambdafunctions;

import week6.lectures.lambdafunctions.classes.Engine;
import week6.lectures.lambdafunctions.interfaces.Printable;
import week6.lectures.lambdafunctions.interfaces.Readable;

public class Startable {
    public static void main(String[] args) {
        Engine engine = new Engine();
        readThing(engine);

        // Instead of creating a class that implements the interface, you can provide the implementation of the methods
        // by using the lambda functions
        // We are now treating the code as a parameter
        readThing(
                () -> {
                    System.out.println("LAMBDA VRNNN");
                }
        );

        // Lambda allows you to put method implementations into the objects like any other variable
        // It can be parametrized
        Readable readableLambda = (() -> System.out.println("VRNNN IN ONE LINE"));
        readThing(readableLambda);

        Printable printableLambda = (prefix -> prefix.concat(" ONE THING"));
        System.out.println(printThing(printableLambda));
    }

    // Any object that implements Readable interface can be passed in here
    public static void readThing(Readable thing){
        thing.read();
    }
    public static String printThing(Printable thing){
        return thing.printMe("!!! IN PRINT THING ");
    }
}
