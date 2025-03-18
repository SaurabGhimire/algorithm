package lab3;

import java.util.Arrays;

public class BubbleSort2 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean isChecked;
        int index = n - 1;
        while(index > 0) {
            isChecked = false;
            for (int j = 0; j < index; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isChecked = true;
                }
            }
            if (!isChecked) break;
            index--;
        }
    }

    // Main method to test the proof
    public static void main(String[] args) {
        int[] bestCaseArr = {1, 2, 3, 4, 5};
        System.out.println("Best Case (Already Sorted):");
        System.out.println(Arrays.toString(bestCaseArr));
        bubbleSort(bestCaseArr);
        System.out.println(Arrays.toString(bestCaseArr));
        System.out.println("-----------------------------------");

        int[] worstCaseArr = {5, 4, 3, 2, 1};
        System.out.println("Worst Case (Reverse Sorted):");
        System.out.println(Arrays.toString(bestCaseArr));
        bubbleSort(worstCaseArr);
        System.out.println(Arrays.toString(bestCaseArr));
    }
}

