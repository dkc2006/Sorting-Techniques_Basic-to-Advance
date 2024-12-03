package sorting.mergeSort;

public class SimpleMergeSort {
    // Driver method
    public static void main(String[] args) {
        int[] a = {12, 11, 13, 5, 6, 7};
        int n = a.length;

        SimpleMergeSort ob = new SimpleMergeSort();
        ob.sort(a, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Function to merge two subarrays of a[]
    void merge(int[] a, int left, int mid, int right) {
        // Sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temp arrays
        System.arraycopy(a, left + 0, leftArray, 0, n1);
        for (int j = 0; j < n2; j++) {
            rightArray[j] = a[mid + 1 + j];
        }

        // Merge the temp arrays back into a[left..right]
        int i = 0, j = 0; // Initial indices of subarrays
        int k = left; // Initial index of merged subarray
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                a[k] = leftArray[i];
                i++;
            } else {
                a[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[]
        while (i < n1) {
            a[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[]
        while (j < n2) {
            a[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Function to sort the array using Merge Sort
    void sort(int[] a, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort the left and right halves
            sort(a, left, mid);
            sort(a, mid + 1, right);

            // Merge the sorted halves
            merge(a, left, mid, right);
        }
    }
}
