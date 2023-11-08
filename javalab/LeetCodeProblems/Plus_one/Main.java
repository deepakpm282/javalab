package LeetCodeProblems.Plus_one;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] result ={};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        int ans = helper(digits,digits.length-1,0)+1;
        return convertToArray(ans);
    }
    public static int helper(int[] arr,int len, int start){
        if(start == arr.length-1){
            return arr[start];
        }
        int val = arr[start];
        return val * (int)Math.pow(10,len) + helper(arr,len-1,start+1);
    }
    public static int[] convertToArray(int num){
        String str = Integer.toString(num);
        int[] array =new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] =str.charAt(i) - '0';
        }
        return array;
    }
}
