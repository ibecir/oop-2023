package week5.lectures.abstraction.classes;

import week5.lectures.abstraction.interfaces.Ability;

public class Dog implements Ability {
    @Override
    public void play() {
        System.out.println("I play with a ball");
    }
}
