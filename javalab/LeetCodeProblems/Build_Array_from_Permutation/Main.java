package LeetCodeProblems.Build_Array_from_Permutation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i< nums.length ; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
