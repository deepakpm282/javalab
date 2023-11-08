package Sorting.Bubblesort;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4,6,7,9,8};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        for(int i = 0 ; i < arr.length;i++){
            for(int j = 1 ; j <arr.length - i; j++ ){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
       return arr;
    }
}
