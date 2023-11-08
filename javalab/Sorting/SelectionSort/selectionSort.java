package Sorting.SelectionSort;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1,6,5,9,7,8};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){

        for( int i = 0 ; i < arr.length ; i++){
            int end = arr.length-i-1;
            int maxIndex = max(arr,0,end);
            swap(arr,maxIndex,end);
        }
        return arr;
    }
    public static int max(int[] arr,int start,int end){
        int max=start ;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int [] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
