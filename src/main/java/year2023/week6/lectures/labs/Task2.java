package year2023.week6.lectures.labs;

public class Task2 {
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                index = i;
                smallest = array[i];
            }
        }
        return index;
    }
}
