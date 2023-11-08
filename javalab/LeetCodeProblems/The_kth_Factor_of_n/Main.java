package LeetCodeProblems.The_kth_Factor_of_n;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(kthFactor(7,2));
    }
    public static int kthFactor(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                arr.add(i);
            }
        }
        if(arr.size() < k){
            return -1;
        }
        return arr.get(k-1);
    }
}
