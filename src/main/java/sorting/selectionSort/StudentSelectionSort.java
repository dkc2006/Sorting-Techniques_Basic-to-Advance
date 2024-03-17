package sorting.selectionSort;

import java.util.Arrays;

public class StudentSelectionSort {
    int rollNumber;
    String name;

    public StudentSelectionSort(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentSelectionSort{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + '}';
    }

}

class Sorter2{
    public static void selectionSort(StudentSelectionSort[] numbers){
        for (int index = 0; index < numbers.length - 1; index++) {
            int minpos = index;
            for (int j = index+1 ; j < numbers.length ; j++) {
                if(numbers[minpos].rollNumber > (numbers[j].rollNumber)){
                    minpos = j;
                }
            }
            //Swap
            StudentSelectionSort temp = numbers[minpos];
            numbers[minpos] = numbers[index];
            numbers[index] = temp;
        }
    }

    public static void main(String[] args) {

        StudentSelectionSort [] numbers = new StudentSelectionSort[]{
                new StudentSelectionSort(18,"kanu"),
                new StudentSelectionSort(3,"Radha"),
                new StudentSelectionSort(25,"java"),
                new StudentSelectionSort(1,"Kanha")
        };
        System.out.println(Arrays.toString(numbers));
        Sorter2 sorter2 = new Sorter2();
        sorter2.selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
