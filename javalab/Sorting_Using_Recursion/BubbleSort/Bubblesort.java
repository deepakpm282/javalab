package Sorting_Using_Recursion.BubbleSort;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
            int[] arr = {3,1,2,6,4,5,8,10,9,12};
            sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int length,int index){
        if( length == 0){
            return;
        }
        if(index < length){
            if(arr[index] > arr[index+1]){
                int temp = arr[index+1];
                arr[index+1] = arr[index];
                arr[index] = temp;
            }
            sort(arr,length,index+1);
        } else {
            sort(arr,length-1,0);
        }
    }
}
