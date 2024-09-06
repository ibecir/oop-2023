package year2023.week7.firstlivesession.recordsexplained;

import java.util.Objects;

class Person {
    private final String name;
    private final int age;
    private final String eyeColor;

    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    @Override
    public String toString(){
        return "Person: [name:" + this.name + ", age: " +this.age + ", eyeColor: " + this.eyeColor + "]";
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age, eyeColor);
    }

    @Override
    public boolean equals(Object object){
        if(object == null)
            return false;
        Person p = (Person) object;
        return this.name.equals(p.getName()) && this.age == p.getAge() && this.eyeColor.equals(p.eyeColor);
    }
}

record PersonRecord(String name, int age, String eyeColor){

    @Override
    public String toString(){
        return "";
    }
};

class TestMyClass{
    public static void main(String[] args) {
        Person p = new Person("Becir", 29, "green");
        Person p2 = new Person("Becirs", 29, "green");

        System.out.println(p.toString());
        System.out.println(p.getName());

        PersonRecord pr = new PersonRecord("Becir", 29, "green");
        PersonRecord pr2 = new PersonRecord("Becirs", 29, "green");

        System.out.println(pr.toString());
        System.out.println(pr.name());
    }
}
