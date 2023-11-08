package Recursion.Steps_to_make_Number_To_Zero;

public class Even_by_two_Odd_Sub_one {
    public static void main(String[] args) {
        System.out.println(run(23,0));
    }
    static int run(int n,int steps){
        if(n == 0){
            return steps;
        }
        if(n % 2 == 0){
            return run(n/2,++steps);
        }
        return run(n-1,++steps);
    }
}
