package sorting.bubbleSort;

import java.util.Arrays;

public class StudentBubbleSort {
    int rollNumber;
    String name;

    public StudentBubbleSort(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public static void main(String[] args) {
        StudentBubbleSort[] numbers = new StudentBubbleSort[]{new StudentBubbleSort(12, "Deepanshu"), new StudentBubbleSort(10, "Anjum"), new StudentBubbleSort(2, "Agraj")};
        System.out.println("Given data : " + Arrays.toString(numbers));
        Sorter1 sorter = new Sorter1();
        sorter.sort(numbers);
        System.out.println("After Sorting : " + Arrays.toString(numbers));
    }

    @Override
    public String toString() {
        return "StudentBubbleSort{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + '}';
    }
}

class Sorter1 {
    public void sort(StudentBubbleSort[] student) {
        for (int counter = 0; counter < student.length; counter++) {
            for (int index = 0; index < student.length - 1; index++) {
                if (student[index].rollNumber > student[index + 1].rollNumber) {
                    StudentBubbleSort temp = student[index];
                    student[index] = student[index + 1];
                    student[index + 1] = temp;
                }
            }
        }
    }
}