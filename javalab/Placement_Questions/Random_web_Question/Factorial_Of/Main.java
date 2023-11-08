package Placement_Questions.Random_web_Question.Factorial_Of;

public class Main {
    public static void main(String[] args) {
        System.out.println(fact(0));
    }
    public static int fact(int num){
        int res = 1;
        if(num == 0){
            return 1;
        }
        for (int i = num; i >0 ; i--) {
            res *= i;
        }
        return res;
    }
}
