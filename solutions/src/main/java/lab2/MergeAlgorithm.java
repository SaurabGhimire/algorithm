package lab2;

import java.util.Arrays;

public class MergeAlgorithm {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 8, 17};
        int[] arr2 = {2, 4, 8, 11, 13, 21, 23, 25};
        int[] mergedList = merge(arr1, arr2);
        System.out.println(Arrays.toString(mergedList));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int left = 0, right = 0, index = 0;

        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] < arr2[right]) {
                result[index] = arr1[left];
                left++;
            } else {
                result[index] = arr2[right];
                right++;
            }
            index++;
        }

        while (left < arr1.length) {
            result[index] = arr1[left];
            left++;
            index++;
        }

        while (right < arr2.length) {
            result[index] = arr2[right];
            right++;
            index++;
        }

        return result;
    }

}

