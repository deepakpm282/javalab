package Placement_Questions.Random_web_Question.Move_All_Zeros;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,9,8,4,0,0,0,2,7,0,6,9};
        System.out.println(Arrays.toString(join(arr)));
    }
    public static int[] join(int[] arr){
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> left = new ArrayList<>();
        int[] all = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0){
                    right.add(arr[i]);
                } else {
                    left.add(arr[i]);
                }
            }
        left.addAll(right);
        for(int i = 0;i<left.size();i++){
            all[i] = left.get(i);
        }
        return all;
    }
}
