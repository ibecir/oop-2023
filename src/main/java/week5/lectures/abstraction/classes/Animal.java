package week5.lectures.abstraction.classes;

// Why would you instantiate the class Animal, there is no so much sense to it
public abstract class Animal {
    private int age;
    private String name;

    // No need to provide the implementation to this method
    // Every child of this class has to provide the implementation of this method
    // It is possible to do it even without the abstract class, but the abstract class
    // enforce and organize what exactly every subclass of abstract class has to have
    public abstract void makeNoise();

    // Not every method does have to be an abstract method inside of abstract class
    public void animalDescription(){
        System.out.println("I'm the ".concat(name).concat(" and I'm ").concat(String.valueOf(age)).concat(" years old."));
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
