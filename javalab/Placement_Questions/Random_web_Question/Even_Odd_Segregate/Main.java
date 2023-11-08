package Placement_Questions.Random_web_Question.Even_Odd_Segregate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12,34,45,9,8,90,3};
        System.out.println(Arrays.toString(join(arr)));
    }
    public static int[] join(int[] arr){
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> left = new ArrayList<>();
        int[] all = new int[arr.length];
        for (int j : arr) {
            if (j % 2 == 0) {
                left.add(j);
            } else {
                right.add(j);
            }
        }
        left.addAll(right);
        for(int i = 0;i<left.size();i++){
            all[i] = left.get(i);
        }
        return all;
    }
}
