package LeetCodeProblems.Shuffle_String;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "aiohn";
        int[] indices = {3,1,4,2,0};
        System.out.println(restoreString(s,indices));
    }
    static String restoreString(String s, int[] indices) {
        int len = s.length();
        char[] ans = new char[indices.length];
        for (int i = 0; i < ans.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }
}
