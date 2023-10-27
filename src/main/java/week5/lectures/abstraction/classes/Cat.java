package week5.lectures.abstraction.classes;

import week5.lectures.abstraction.classes.Animal;

public class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("MEOW");
    }
}
