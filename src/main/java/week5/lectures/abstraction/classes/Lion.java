package week5.lectures.abstraction.classes;

import week5.lectures.abstraction.interfaces.Ability;

public class Lion extends Animal implements Ability {
    @Override
    public void makeNoise() {
        System.out.println("GRRRRRRR");
    }

    @Override
    public void play() {
        System.out.println("I play with people in a way I eat them.");
    }
}
