package Linearsearch;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.*;

public class maxim {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][] arr = {
                {12,43,23,4},
                {98,67,5,12},
                {2,15,8,9}
        };
        int target=15;
        int value = max(arr);
        System.out.println(value);
    }
    static int max(int[][] arr){
        int maxi=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int elements : ints) {
                if(elements>maxi){
                    maxi = elements;
                }
            }
        }
        return maxi;
    }

}
