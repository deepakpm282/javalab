package Recursion.Steps_to_zero;

public class steps {
    public static void main(String[] args){
        int ans = numberOfSteps(8);
        System.out.println(ans);
    }
    static int numberOfSteps(int num) {
        int count = 0;
        return helper(num,count);
    }
    static int helper(int num, int count){
        if(num == 0){
            return count;
        }
        if(num % 2 == 0){
            count++;
            return helper(num/2,count);
        } else {
            count++;
            return helper(num-1,count);
        }
    }
}
