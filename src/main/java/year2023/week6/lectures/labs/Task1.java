package year2023.week6.lectures.labs;

public class Task1 {
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
}
