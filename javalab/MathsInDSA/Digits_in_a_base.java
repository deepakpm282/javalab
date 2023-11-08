package MathsInDSA;

public class Digits_in_a_base {
    /*
        In a number with base n to find to number of digits
        logb(a) = x then a = b^x the integer value of will give the number of digits
        in the number b -- base,a -- number
     */
    public static void main(String[] args) {
     int number = 10;
     int base = 16;
     int ans = (int)(Math.log(number)/Math.log(base) +1);
        System.out.println(ans);
    }
}
