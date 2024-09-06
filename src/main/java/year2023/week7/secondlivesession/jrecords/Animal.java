package year2023.week7.secondlivesession.jrecords;

import java.util.Objects;

class Animal {
    private final String name;
    private final int age;
    private final int numOfLegs;

    public Animal(String name, int age, int numOfLegs) {
        this.name = name;
        this.age = age;
        this.numOfLegs = numOfLegs;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name, this.age, this.numOfLegs);
    }

    @Override
    public String toString(){
        return "Animal [name: " + this.name + ", age: " + this.age + ", numOfLegs: " + this.numOfLegs + "]";
    }

    @Override
    public boolean equals(Object object){
        Animal animal = (Animal) object;

        /*
        if(this.name.equals(animal.getName()) && this.age == animal.getAge() && this.numOfLegs == animal.getNumOfLegs()){
            return true;
        }
        return false;
        */

        return this.name.equals(animal.getName())
                && this.age == animal.getAge()
                && this.numOfLegs == animal.getNumOfLegs();
    }
}

record AnimalRecord(String name, int age, int numOfLegs){};

class Testable {
    public static void main(String[] args) {
        Animal kokoska = new Animal("Kokoska", 15, 2);
        Animal kokoskaSecond = new Animal("Kokoskaa", 15, 2);

        AnimalRecord kokoskaR = new AnimalRecord("Kokoska", 15, 2);
        AnimalRecord kokoskaSecondR = new AnimalRecord("Kokoska", 15, 2);

        System.out.println(kokoskaR.equals(kokoskaSecondR));
    }
}