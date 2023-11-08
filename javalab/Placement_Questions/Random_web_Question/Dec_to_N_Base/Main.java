package Placement_Questions.Random_web_Question.Dec_to_N_Base;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(Conversion(12,718));
    }
    public static String Conversion(int base,int num){
        ArrayList<Integer> arr = new ArrayList<>();
        String str = "";
        int quotient = num / base;
        arr.add(num % base);
        while(quotient != 0){
            arr.add(quotient % base);
            quotient /= base;
        }
        System.out.println(arr);
        for (int i = arr.size()-1; i >=0; i--) {
            if(arr.get(i) > 9){
                str += (char)(arr.get(i)-9+64);
            } else {
                str += arr.get(i);
            }
        }
        return str;
    }
}
