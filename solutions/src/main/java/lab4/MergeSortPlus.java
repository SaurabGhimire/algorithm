package lab4;
import sortroutines.InsertionSort;

public class MergeSortPlus {
    InsertionSort insertionSort = new InsertionSort();
    public void mergeSortPlus(int[] arr, int left, int right) {
        if (right - left + 1 <= 20) {
            insertionSort.sort(arr);
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSortPlus(arr, left, mid);
        mergeSortPlus(arr, mid + 1, right);

        mergeSortPlus(arr, left, right);
    }
}
