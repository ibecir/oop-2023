package year2023.week5.lectures.abstraction.classes;

import year2023.week5.lectures.abstraction.interfaces.Ability;

public class Dog extends Animal implements Ability {
    @Override
    public void play() {
        System.out.println("I play with a ball");
    }

    @Override
    public void makeNoise() {

    }
}
