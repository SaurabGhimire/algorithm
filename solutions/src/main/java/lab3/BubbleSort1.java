package lab3;

import java.util.Arrays;

public class BubbleSort1 {
    public static void bubbleSort(int[] arr) {
        boolean isChecked;
        for (int i = 0; i < arr.length - 1; i++) {
            isChecked = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isChecked = true;
                }
            }
            if (!isChecked) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        bubbleSort(arr);
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
