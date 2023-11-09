package week7.lectures.lambdafunctions.interfaces;

// Interfaces with one single method is called an FUNCTIONAL INTERFACE
// SAM interfaces - Single Abstract Method interface
// Lambdas can only be used in the sense of the Functional Interfaces
public interface Printable {
    public String printMe(String prefix); // Abstract method
}
