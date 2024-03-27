package sorting.selectionSort;

import java.util.Arrays;

public class SimpleSelectionSort {
    public static void selectionSort(int[] numbers) {
        for (int index = 0; index < numbers.length - 1; index++) {
            int minpos = index;
            for (int j = index + 1; j < numbers.length; j++) {
                if (numbers[minpos] > numbers[j]) {
                    minpos = j;
                }
            }
            //Swap
            int temp = numbers[minpos];
            numbers[minpos] = numbers[index];
            numbers[index] = temp;
        }
    }


    public static void main(String[] args) {
        int[] numbers = new int[]{8, 5, 7, 4, 6, 3, 1, 2};
        System.out.println("Given numbers are : " + Arrays.toString(numbers));
        SimpleSelectionSort sort = new SimpleSelectionSort();
        selectionSort(numbers);
        System.out.println("Sorted numbers are : " + Arrays.toString(numbers));

    }
}

//                       OR

//Selection sort
//class Sorter{
//    void selectionSort(int[] numbers){
//        for (int swapIndex =0 ;swapIndex< numbers.length-1;swapIndex++) {
//            int minimumIndex = swapIndex;
//            int swappedIndex = 0;
//
//            for (int index = swapIndex+1;index<numbers.length;index++) {
//                if(numbers[0] < numbers[minimumIndex]){
//                    minimumIndex = index;
//                }
//            }
//            int temp = numbers[swapIndex];
//            numbers[swapIndex] = numbers[minimumIndex];
//            numbers[minimumIndex] = temp;
//        }
//    }
//}