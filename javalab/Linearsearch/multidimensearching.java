package Linearsearch;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.*;

public class multidimensearching {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][] arr = {
                        {12,43,23,4},
                        {98,67,5,12},
                        {2,15,8,9}
                        };
        int target=15;
        int[] value = search(arr,target);
        System.out.println(Arrays.toString(value));
    }
    static int[] search(int[][] arr,int target){
            int min=Integer.MIN_VALUE;
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
