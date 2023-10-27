package week4.labs.people;

public class Person {
    private String name;
    private String address;
    private int age;
    private String country;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String toString(){
        return this.name + "\n\t" + this.address;
    }
}
