package Linearsearch;

import java.util.Scanner;

public class maxwealth {
    public static void main(String[] args) {
            int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maxWealth(accounts));
        }
    static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int[] in : accounts) {
            int sum = 0;
            for (int account = 0; account < in.length; account++) {
                sum += in[account];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
