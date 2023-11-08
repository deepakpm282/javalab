package Placement_Questions.Random_web_Question.Minimum_Penalty_With_ABS;
import java.util.Collections;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,7,6,10,9,8};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    swap(i,j,arr);
                }
            }
        }
        System.out.println(Arrays.toString((arr)));
        System.out.println(Minimum_penalty(arr));
    }
    public static int Minimum_penalty(int[] arr){
        int min_penalty = 0;
            for (int k = 0; k < arr.length-1; k++) {
                min_penalty += Math.abs(arr[k] - arr[k+1]);
            }
        return min_penalty;
    }
    public static void swap(int a,int b,int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
