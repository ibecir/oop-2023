package year2023.week5.labs.task2;

public class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weight;

    public Book(String wr, String n, double w){
        this.writer = wr;
        this.name = n;
        this.weight = w;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public String toString(){
        return this.writer + ": " + this.name;
    }

}
