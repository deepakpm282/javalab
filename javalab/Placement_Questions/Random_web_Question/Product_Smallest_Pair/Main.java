package Placement_Questions.Random_web_Question.Product_Smallest_Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9,8,3,-7,3,9};
        System.out.println(product(9,arr));
    }
    public static int product(int sum,int[] arr){
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i : arr){
            newArr.add(i);
        }
        Collections.sort(newArr);
        if(newArr.get(0) + newArr.get(1) < sum){
            return newArr.get(0) * newArr.get(1);
        }
        return 0;
    }
}
