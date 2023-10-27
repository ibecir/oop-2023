package week5.lectures.polymorphism.classes;

import week5.lectures.polymorphism.enums.Colors;

public class Animal {
    private String name;
    private Colors color;

    // We have multiple methods with exactly the same name with different parameters
    // This is called a method overloading and it is a form of polymorphism
    public void eat(){
        System.out.println("MLJAC MLJAC");
    }

    public void eat(String sound){
        System.out.println(sound);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
