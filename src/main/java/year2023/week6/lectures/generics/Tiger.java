package year2023.week6.lectures.generics;

public class Tiger extends Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat(){
        System.out.println("Tiger eating");
    }
}