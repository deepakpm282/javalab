package Placement_Questions.Random_web_Question.NumberOfCarries;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println(carry(451,349));
    }
    public static int carry(int num1 , int num2){
        int count = 0;
        while(num1 % 10 != num1 && num2 % 10 != num2){
            int carryVal = num1 % 10 + num2 % 10;
            if(carryVal > 9){
                int firstVal = firstValue(carryVal);
                count++;
                num1 /= 10;
                num1 += firstVal;
            } else {
                num1 /= 10;
            }
            num2 /= 10;
        }
        return count;
    }
    public static int firstValue(int val){
        while(val % 10 != val){
            int rem = val % 10;
            val /= 10;
        }
        return val;
    }
}
