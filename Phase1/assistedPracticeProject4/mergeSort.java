package assistedPracticeProject4;

public class mergeSort {
    public static void mergeSort(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return; 
        }

        int mid = n / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[n - mid];

        System.arraycopy(arr, 0, leftHalf, 0, mid);
        System.arraycopy(arr, mid, rightHalf, 0, n - mid);
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(arr, leftHalf, rightHalf);
    }

    public static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int leftLength = leftHalf.length;
        int rightLength = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (leftHalf[i] <= rightHalf[j]) {
                arr[k++] = leftHalf[i++];
            } else {
                arr[k++] = rightHalf[j++];
            }
        }
        while (i < leftLength) {
            arr[k++] = leftHalf[i++];
        }
        while (j < rightLength) {
            arr[k++] = rightHalf[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
