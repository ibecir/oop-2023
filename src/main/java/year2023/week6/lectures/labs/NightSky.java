package year2023.week6.lectures.labs;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private Random r = new Random();
    private int numberOfStars = 0;

    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine(){
        for(int i = 0; i<this.width; i++){
            long result = Math.round(Math.random());
            if(result == 1){
                System.out.print("*");
                this.numberOfStars++;
            }else{
                System.out.print(" ");
            }
        }
    }

    public void print(){
        for(int i = 0; i<this.height; i++){
            printLine();
            System.out.println("");
        }
    }

    public int starsInLastPrint(){
        return this.numberOfStars;
    }


}