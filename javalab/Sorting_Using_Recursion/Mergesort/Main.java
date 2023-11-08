package Sorting_Using_Recursion.Mergesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,2,1};
        mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] right = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] left = mergesort(Arrays.copyOfRange(arr, mid, arr.length ));

        return merge(right, left);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length -1 && j < second.length-1) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
