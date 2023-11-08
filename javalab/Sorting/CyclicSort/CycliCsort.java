package Sorting.CyclicSort;
import java.util.Arrays;
/*when give array is in range 1 to N usw cyclic sort*/
public class CycliCsort {
    public static void main(String[] args) {
        int[] arr = {2,5,9,6,9,3,8,9,7,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        for(int i = 0;i < arr.length;i++){
            int correct = arr[i] - 1;
            if(arr[i] != correct){
                swap(arr,i,correct);
            }
        }
        return arr;
    }
    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] =temp;
    }
}
