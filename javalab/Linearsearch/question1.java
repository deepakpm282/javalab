package Linearsearch;
import java.util.Arrays;
public class question1 {
    public static void main(String[] args) {
        int[] nums ={3,2,4};
        int []ans = twoSum(nums,6);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] nums,int target){
        for (int index1 = 0; index1 < nums.length; index1++){
            int bal = target -nums[index1];
            int index2 = check(bal,nums);
            return new int[]{index1,index2};
            }
        return new int[]{-1,-1};
        }
        static int check(int num,int [] nums){
            for (int index = 0; index < nums.length; index++) {
                if(num == nums[index]){
                    return index;
                }
            }
            return -1;
        }
}
