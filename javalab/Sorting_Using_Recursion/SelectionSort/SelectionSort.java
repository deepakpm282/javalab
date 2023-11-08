package Sorting_Using_Recursion.SelectionSort;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {0,2,5,3,7,4,9,8};
        sort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int [] arr,int length,int index,int max){
        if( length == 0){
            return;
        }
        if(index < length){
            if(arr[index+1] > arr[max]){
                sort(arr,length,index+1,index+1);
            }else {
                sort(arr,length,index+1,max);
            }
        } else {
            int temp = arr[length];
            arr[length] = arr[max];
            arr[max] = temp;
            sort(arr,length-1,0,0);
        }
    }
}
