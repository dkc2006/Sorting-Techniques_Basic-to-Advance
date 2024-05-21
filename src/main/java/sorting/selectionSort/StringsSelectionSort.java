package sorting.selectionSort;

import java.util.Arrays;

public class StringsSelectionSort {
    public static void selectionSort(String[] names) {
        for (int index = 0; index < names.length - 1; index++) {
            int minpos = index;
            for (int j = index + 1; j < names.length; j++) {
                if (names[minpos].compareTo(names[j]) > 0) {
                    minpos = j;
                }
            }
            //Swap
            String temp = names[minpos];
            names[minpos] = names[index];
            names[index] = temp;
        }
    }

    public static void main(String[] args) {
        String[] names = new String[]{"Kanu", "Deepanshu", "Shyamji", "Bholenath", "Ramji"};
        System.out.println("Given names are : " + Arrays.toString(names));
        selectionSort(names);
        System.out.println("Sorted names are : " + Arrays.toString(names));
    }
}
