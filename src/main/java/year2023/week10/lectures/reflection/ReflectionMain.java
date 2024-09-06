package year2023.week10.lectures.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Cicko", 12);
        myCat.saySomething("SOMETHING");
        myCat.getClass(); // Window to number of reflection capabilities of Java
        Field[] catFields = myCat.getClass().getDeclaredFields(); // Get all fields of the class

        for (Field f : catFields) {
            System.out.println(f.getName());
        }
        // We can write code that can give us the structure of our Java class
        // Even a private variables can be accessed by using the reflection
        // The final variable cannot be changed, but it can by using reflection

        //myCat.name = "Fred"; // NOT ALLOWED AT ALL!!!

        for (Field field : catFields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Micko Cicko"); // You have to handle the exception that could be thrown
            }
        }

        System.out.println(myCat.getName());

        // This is also true for the methods, you can do a same things
        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for (Method method : catMethods) {
            System.out.println(method.getName());
            // We want to invoke (call) method meow
            if (method.getName().equals("meow")) {
                method.invoke(myCat); // Exception to be handled
            } else if (method.getName().equals("saySomething")) {
                method.invoke(myCat, "AW AW AW"); // Params are passed in order they are in the method signature
            } else if (method.getName().equals("heyThisIsPrivate")) {
                method.setAccessible(true);
                method.invoke(myCat); // This will not work if we do not se accessibility
            } else if (method.getName().equals("thisIsPublicStaticMethod")) {
                method.invoke(null); // Static methods does not need the object
            }
        }

        /*
         * Why would you need this?
         *
         * 1. Heavily used in frameworks, Spring uses it to see the classes you defined and to create
         *    objects from those classes.
         *    Dependencies & Loads/Injects them dynamically based on Annotation Information.
         * 2. We would use it for testing purposes. Ex. There is a class with private attributes,
         *    we may want to change that private attribute in order to test how the program behaves.
         *
         * HOWEVER, BE CAREFUL WHEN USING IT. IT IS EASY TO BREAK EVERYTHING
         * */
    }
}
