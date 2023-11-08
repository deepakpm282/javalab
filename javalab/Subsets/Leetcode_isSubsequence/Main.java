package Subsets.Leetcode_isSubsequence;

public class Main {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }
    static boolean isSubsequence(String s, String t) {
        return helper(s, "", t);
    }
    static boolean helper(String s, String p, String up){
        if(up.isEmpty()){
            return false;
        }
        if(p.equals(s)){
            return true;
        }
        char ch = up.charAt(0);
        for(int i = 0; i <=p.length();i++){
            String start = p.substring(0,i);
            String end = p.substring(i,p.length());
            helper(s,start + ch + end ,up.substring(1));
        }
        return false;
    }
}
