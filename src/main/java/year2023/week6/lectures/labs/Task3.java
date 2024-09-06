package year2023.week6.lectures.labs;

public class Task3 {
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallest = array[index];
        int indexOfSmallest = index;

        for(int i = index+1; i < array.length; i++){
            if(array[i] < smallest){
                indexOfSmallest = i;
                smallest = array[i];
            }
        }
        return indexOfSmallest;
    }
}
