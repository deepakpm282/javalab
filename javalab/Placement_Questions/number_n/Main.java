package Placement_Questions.number_n;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(nthNumber(37,6));
    }
    public static int nthNumber(int num,int n){
        ArrayList<Integer> arr =new ArrayList<>();
        for (int i = num; i <=num+2*n; i++) {
            int count = 2;
            boolean isprime = true;
            for (int j = 2; j <=i/2; j++) {
                if(i % j == 0){
                    num+=1;
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                arr.add(i);
            }
        }
        System.out.println(arr);
        return arr.get(n);
    }
}
