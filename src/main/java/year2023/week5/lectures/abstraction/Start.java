package year2023.week5.lectures.abstraction;

public class Start {
    // Abstract class is a class that you cannot instantiate

    /**
     * Both interfaces and abstract classes provide the same ability
     * So any class implementing them has to have the declared methods
     * So what is the difference?
     *  1. You can implement as many interfaces as you want in Java, but you can only extend 1 class
     *  2. Any field declared in the interface will be both, static and final.
     *     This means that every object will have the same value for an attribute in an interface
     *     In that sense, having the fields in an interface, in most cases makes no sens
     *     That is why, the abstract classes are better for these kind of problems, as
     *     each individual object (Cat, Dog, Lion) can have their values stored
     *
     *  SO YOU WILL USE THE ABSTRACT CLASS IF YOU HAVE A LOT OF CLOSELY RELATED CLASSES THAT YOU
     *  WANT TO HAVE THE SAME FUNCTIONALITY AND THE SAME TYPES OF FIELDS
     *
     *  YOU MIGHT USE THE INTERFACE IF YOU HAVE A LOT OF UNRELATED CLASSES THAT YOU ALL WANT TO
     *  BE ABLE TO DO A CERTAIN THING. SO OTHER TYPES OF CLASSES THAT HAVE TO HAVE CERTAIN FUNCTIONALITY
     *  (In our example play method in the Ability interface can be used even for ex. Person, Child classes)
     *  AS THEY ALL WILL HAVE THAT ABILITY BUT THEY ARE TOTALLY NOT RELATED CLASSES.
     */

}
