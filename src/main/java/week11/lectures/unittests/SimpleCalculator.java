package week11.lectures.unittests;

// Single piece of code/unit is being tested
// Unit test isolates single piece of code and verifies that that piece is working correctly
// Usually for Java that is a class or a method inside the class
// Unit test is code written in Java that hits the specific method in Java and verifies that it works properly

// We will be using the JUnit framework for our unit tests (there are similar frameworks in other programming languages)
public class SimpleCalculator {
    public int add(int numA, int numB) {
        return numA - numB;
    }
}
