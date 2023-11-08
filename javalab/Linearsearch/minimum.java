package Linearsearch;

import java.util.Arrays;

public class minimum {
    public static void main(String[] args) {
        int[] arr = {10,3,56,14,-13};
        System.out.println(Arrays.toString(arr));
        System.out.println(min(arr));
    }
    static int min(int[]arr) {
        int ans = arr[0];
        for (int j : arr) {
            if (j < ans) {
                ans = j;
            }
        }
        return ans;
    }
}
