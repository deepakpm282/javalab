package Placement_Questions.Random_web_Question.Diff_divisible_NonDivisible;

public class Main {
    public static void main(String[] args) {
        System.out.println(Diff_Of_Numbers(4,20));
    }
    public static int Diff_Of_Numbers(int n, int m){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= m; i++) {
            if(i % n == 0) sum1 += i;
            else sum2 += i;
        }
        return sum2 - sum1;
    }
}
