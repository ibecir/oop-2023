package year2023.week7.lectures.lambdafunctions;

import year2023.week7.lectures.lambdafunctions.classes.Engine;
import year2023.week7.lectures.lambdafunctions.interfaces.Printable;
import year2023.week7.lectures.lambdafunctions.interfaces.Readable;


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

        Printable printableLambda = (suffix -> suffix.concat(" ONE THING"));
        Printable printableLambdaReturn = (suffix -> {
            System.out.println("Returning value");
            return suffix.concat(" ONE THING");
        });

        System.out.println(printThing(printableLambda));
    }

    // Any object that implements Readable interface can be passed in here
    public static void readThing(Readable thing) {
        thing.read();
    }

    public static String printThing(Printable thing) {
        return thing.printMe("!!! IN PRINT THING ");
    }
}


interface OperationInterface {
    int operation(int a, int b);
}
interface MessageInterface {
    String sayMessage(String message);
}
class Testable {

    public static void main(String args[]) {
        // lambda expression for addition for two parameters data type for x and y is optional. This expression implements 'OperationInterface' interface
        OperationInterface add = (int x, int y) -> x + y;

        // lambda expression multiplication for two parameters This expression also implements 'OperationInterface' interface
        OperationInterface multiply = (int x, int y) -> x * y;

        // Creating an object of Test to call operate using different implementations using lambda Expressions
        Testable tobj = new Testable();

        // Add two numbers using lambda expression
        System.out.println("Addition is " + operate(6, 3, add));

        // Multiply two numbers using lambda expression
        System.out.println("Multiplication is " + operate(6, 3, multiply));

        // lambda expression for single parameter
        // This expression implements 'FuncInter2' interface
        MessageInterface fobj = message -> "Hello " + message;
        String message = fobj.sayMessage("Geek");
        System.out.println(message);
    }

    private static int operate(int a, int b, OperationInterface object) {
        return object.operation(a, b);
    }
}