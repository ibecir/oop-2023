package week6.lectures.binarysearch;

// Java implementation of iterative Binary Search

import java.io.*;

class BinarySearch {

    // Returns index of x if it is present in arr[].
    int binarySearch(int arr[], int x)
    {
        // int arr[] = { 2, 3, 4, 10, 40, 7, 18 };
        // { 2, 3, 4, 7, 10, 18, 40 }
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[middle] == x)
                return middle;

            // If x greater, ignore left half
            if (arr[middle] < x)
                left = middle + 1;

                // If x is smaller, ignore right half
            else
                right = middle - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }

    // Driver code
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }
}
