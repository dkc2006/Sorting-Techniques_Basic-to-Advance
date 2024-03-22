package sorting.bubbleSort;

import java.util.Arrays;

public class SimpleBubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 2, 8, 9, 1, 3, 7, 4};
        System.out.println("Given numbers are : " + Arrays.toString(numbers));
        SimpleBubbleSort sorter = new SimpleBubbleSort();
        sorter.sort(numbers);
        System.out.println("Sorted numbers are : " + Arrays.toString(numbers));
    }

    public void sort(int[] numbers) {
        for (int counter = 0; counter < numbers.length; counter++) {
            for (int index = 0; index < numbers.length - 1; index++) {
                if (numbers[index] > numbers[index + 1]) {
                    int temp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temp;
                }
            }
        }

    }
}



