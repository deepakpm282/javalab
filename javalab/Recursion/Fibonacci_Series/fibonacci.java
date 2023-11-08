package Recursion.Fibonacci_Series;
//Here the nth fibonnaci number is printed

public class fibonacci {
    // nth fibonacci number
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }
    static int fibo(int n) {
        if(n == 1){
            return 0;
        }
        if(n<2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
/*
Here the 10th fibonnaci number is the sum of last and second last element.
so last and second last will be returned but only after the last number is obtained by
its last and second last number
 */
