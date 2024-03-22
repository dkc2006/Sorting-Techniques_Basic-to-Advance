package sorting.bubbleSort;

import java.util.Arrays;

public class StringsBubbleSort {
    public static void main(String[] args) {
        String[] names = new String[]{"Kanu", "Vansh", "Khandelwal", "Apple", "Boy", "Cat", "Dog"};
        StringsBubbleSort sorter = new StringsBubbleSort();
        sorter.bubblesort(names);
        System.out.println(Arrays.toString(names));

    }

    public void bubblesort(String[] names) {
        for (int counter = 0; counter < names.length; counter++) {
            for (int index = 0; index < names.length - 1; index++) {
                if (names[index].compareTo(names[index + 1]) > 0) {
                    String temp = names[index];
                    names[index] = names[index + 1];
                    names[index + 1] = temp;
                }
            }
        }
    }
}


