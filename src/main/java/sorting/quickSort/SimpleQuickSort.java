package sorting.quickSort;

// Java program for implementation of QuickSort
public class SimpleQuickSort {
    // Driver method
    public static void main(String[] args) {
        int[] a = {10, 7, 8, 9, 1, 5};
        int n = a.length;

        SimpleQuickSort ob = new SimpleQuickSort();
        ob.sort(a, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Function to partition the array
    int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (a[j] <= pivot) {
                i++;
                // Swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // Swap a[i+1] and a[high] (or pivot)
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    // Function to implement QuickSort
    void sort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);

            // Recursively sort elements before and after partition
            sort(a, low, pi - 1);
            sort(a, pi + 1, high);
        }
    }
}
