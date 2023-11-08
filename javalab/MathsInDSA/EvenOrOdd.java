package MathsInDSA;

public class EvenOrOdd {
    public static void main(String[] args) {
        int target = 88;
        System.out.println(Odd(target));
    }
    static boolean Odd(int target){
        return (target & 1) == 1;
        /*Any number and operation with 1
        will do the and operation of 1 with the last digit
        of the whole number , 2^0 part because it decides
        the number is odd or not.
        Any number & operation with any number wil give same
        number.So here we use that.
         */
    }
    static boolean Even(int n){
        return (n & 1) ==0;
    }
}
