package week2.lectures;

import java.util.Scanner;

public class LoopsAndMethods {

    public static String sayMyName(String name) {
        return "Your name is " + name;
    }

    /*

     1
     1 2
     1 2 3 // THIS WILL BE DICTATED BY THE PARAMETER

     */
    public static void printHalfPyramidShapeOfNRows(int numOfRows) {
        sayMyName("BECIR");
        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printHalfPyramidShapeOfNRows(5);

        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int becirAgaIshakovic = reader.nextInt();

        System.out.println("Please enter second number: ");
        int end = reader.nextInt();

        LoopsAndMethods objInstance = new LoopsAndMethods();

        objInstance.printNumbersInRange(becirAgaIshakovic, end);

        String whatIsMyName = sayMyName("Becir");
        System.out.println(whatIsMyName);
    }

    public void printNumbersInRange(int start, int end) {
        for (int i = start; start <= end; start++) {
            System.out.println(i);
            i++;
        }
        sayMyName("Becir");
    }
}
