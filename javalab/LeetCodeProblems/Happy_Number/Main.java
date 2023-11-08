package LeetCodeProblems.Happy_Number;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        return helper(n , arr,0);
    }
    public static boolean helper(int n , ArrayList<Integer> arr,int sum){
        if(n == 1){
            return true;
        }
        int digits  = (int)Math.log10(n)+1;
        while(digits != 0){
            int num1 = n % 10;
            sum += num1*num1;
            n /=10;
            digits--;
        }
        if(isPresent(arr,sum)){
            return false;
        }
        arr.add(sum);
        return helper(sum,arr,0);
    }
    public static boolean isPresent(ArrayList<Integer> arr, int ans){
        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i) == ans){
                return true;
            }
        }
        return false;
    }
}
