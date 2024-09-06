package year2023.week6.lectures.labs;

public class Task6 {
    public static void printElegantly(int[]array) {
        for (int i=0; i < array.length ; i++ ) {
            if (i==array.length-1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i]+", ");
            }
        }
    }
}
