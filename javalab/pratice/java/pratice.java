package pratice.java;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class pratice {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,2};
//        System.out.println(Arrays.toString(level(arr)));
          Max_Index(arr);
    }

    public static int[] level(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min=arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (min > arr[j]) {
                    arr[i] = arr[j];
                    break;
                } else {
                    arr[i] = -1;
                }
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }
    public static void Max_Index(int[] arr){
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > val){
                    max = arr[j];
                    index = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
