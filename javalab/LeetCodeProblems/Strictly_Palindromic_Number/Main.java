package LeetCodeProblems.Strictly_Palindromic_Number;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(4));
    }
    public static boolean isStrictlyPalindromic(int n) {
        for(int i = 2; i <=n-2;i++){
            StringBuilder Value = new StringBuilder();
            ConvertToBase(n,i,Value);
            Value.reverse();
            if(!palindrome(Value,"")){
                return false;
            }
        }
        return true;
    }
    public static StringBuilder ConvertToBase(int n, int base,StringBuilder up){
        if(n == 0){
            return up;
        }
        int temp = n % base;
        up.append(temp);
        return ConvertToBase(Math.floorDiv(n,base),base,up);
    }
    public static boolean palindrome(StringBuilder up, String p){
        StringBuilder newP = new StringBuilder(p);
        for (int i = up.length()-1; i >=0 ; i--) {
            char ch = up.charAt(i);
            newP.append(ch);
        }
        return newP.toString().contentEquals(up);
    }
}
