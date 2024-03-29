package sorting.insertionSort;

import java.util.Arrays;

public class SimpleInsertionSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 2, 8, 9, 1, 3, 7, 4};
        System.out.println("Given numbers are : " + Arrays.toString(numbers));
        SimpleInsertionSort simpleInsertionSort = new SimpleInsertionSort();
        simpleInsertionSort.insertionSort(numbers);
        System.out.println("Sorted numbers are : " + Arrays.toString(numbers));
    }

    void insertionSort(int[] numbers) {
        for (int index = 1; index < numbers.length; index++) {
            int currentElement = numbers[index]; // corrected from numbers[1] to numbers[index]
            int comparingIndex = index - 1;
            while (comparingIndex >= 0 && currentElement < numbers[comparingIndex]) {
                numbers[comparingIndex + 1] = numbers[comparingIndex];
                comparingIndex--;
            }
            numbers[comparingIndex + 1] = currentElement; // corrected from numbers[currentElement] to currentElement
        }
    }
}
