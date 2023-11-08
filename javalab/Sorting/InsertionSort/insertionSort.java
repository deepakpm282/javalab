package Sorting.InsertionSort;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,6,4,5,9,8,7};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = i+1 ; j > 0 ; j--){
                if(arr[j] < arr[i]){
                    swap(arr[j],arr[i]);
                } else {
                    break;
                }
            }
        }
        return arr;
    }
    public static void swap(int first , int second){
        int temp = first;
        first = second;
        second = temp;
    }
}
