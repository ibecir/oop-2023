package week7.lectures.records;

import java.util.Objects;

record Person(String name, int age, int height) {
    public static String UNKNOWN_ADDRESS = "Unknown";

    public Person(String name) {
        this(name, 0, 0);
    }

    public static Person unnamed(String name) {
        return new Person(name);
    }

    public int a() {
        return 1;
    }
}

class PersonC {
    private String name;
    private int age;
    private int height;

    public PersonC(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "PersonC class -> name: " + this.name + ", age: " + this.age + ", height: " + this.height;
    }

    @Override
    public boolean equals(Object obj) {
        PersonC compared = (PersonC) obj;
        if (this.name.equals(compared.getName()) && this.age == compared.getAge() && this.height == compared.getHeight())
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }
}

class RunMe {
    public static void main(String[] args) {
        Person firstPerson = new Person("Becir", 29, 180);
        Person secondPerson = new Person("Adnan", 35, 185);

        System.out.println(firstPerson.a());
        System.out.println(firstPerson.name());
        System.out.println(secondPerson.name());
    }
}


