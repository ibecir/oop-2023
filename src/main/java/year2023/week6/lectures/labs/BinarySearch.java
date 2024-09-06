package year2023.week6.lectures.labs;

public class BinarySearch {
    public static int search(int[] array, int first, int last, int searchedValue){
        if (last>=first){
            int mid = first+(last - first)/2;

            if (array[mid] == searchedValue){
                return mid;
            }

            if (array[mid] > searchedValue){
                return search(array, first, mid-1, searchedValue);//search in left subarray
            }else{
                return search(array, mid+1, last, searchedValue);//search in right subarray
            }
        }
        return -1;
    }
}