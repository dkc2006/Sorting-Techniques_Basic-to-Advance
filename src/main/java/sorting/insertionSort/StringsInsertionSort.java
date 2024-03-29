package sorting.insertionSort;

import java.util.Arrays;

public class StringsInsertionSort {
    public static void main(String[] args) {
        String[] names = new String[]{"Kanu", "Deepanshu", "Shyamji", "Bholenath", "Ramji"};
        System.out.println("Given names are : " + Arrays.toString(names));
        StringsInsertionSort stringsInsertionSort = new StringsInsertionSort();
        stringsInsertionSort.insertionSort(names);
        System.out.println("Sorted numbers are : " + Arrays.toString(names));
    }

    void insertionSort(String[] names) {
        for (int index = 1; index < names.length; index++) {
            String currentElement = names[index];
            int comparingIndex = index - 1;
            while (comparingIndex >= 0 && names[comparingIndex].compareTo(currentElement) > 0) {
                names[comparingIndex + 1] = names[comparingIndex];
                comparingIndex--;
            }
            names[comparingIndex + 1] = currentElement;
        }
    }
}
