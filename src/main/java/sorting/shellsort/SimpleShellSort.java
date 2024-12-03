package sorting.SimpleShellSort;

public class SimpleShellSort {

    // Driver method to test the Shell Sort algorithm
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};

        SimpleShellSort sorter = new SimpleShellSort();
        sorter.sort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to implement Shell Sort
    void sort(int[] arr) {
        int n = arr.length;

        // Start with a large gap and reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform a gapped insertion sort for the current gap size
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;

                // Shift earlier gap-sorted elements up until the correct location for arr[i] is found
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                // Place temp (the original arr[i]) in its correct location
                arr[j] = temp;
            }
        }
    }
}
