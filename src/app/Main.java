package app;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.printf("Original array: %s\n", Arrays.toString(array));

        ArrayUtils.mergeSort(array);
        System.out.printf("Sorted array: %s\n", Arrays.toString(array));

        try {
            var index = ArrayUtils.binarySearch(array, 38);
            System.out.println("Target found. Index: " + index);
        } catch (NoSuchElementException e){
            System.out.println("Target not found");
        }
    }
}