package year2023.week5.labs.task2;

public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;

    public CD(String a, String t, int pY){
        this.artist = a;
        this.title = t;
        this.publishingYear = pY;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }
}
