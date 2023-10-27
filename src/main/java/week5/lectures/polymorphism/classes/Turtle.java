package week5.lectures.polymorphism.classes;

public class Turtle extends Animal{
    private String breed;

    @Override
    public void eat(){
        System.out.println("TURTLE MLJAC MLJAC");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
