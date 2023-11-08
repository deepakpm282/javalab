package LeetCodeProblems.Password_validation;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'a','9','8','7',' ','a','b','C','0','1','2'};
        int n = arr.length;
        System.out.println(CheckPassword(arr,n));
    }
    public static int CheckPassword(char[] str, int n){
        boolean size = false; boolean Numeric_Digit = false; boolean Capital_letter = false;
        boolean space_slash = false; boolean staring_num = false;
        for (char c : str) {
            if (n > 4) size = true;
            if (c - '0' <= 9) Numeric_Digit = true;
            if (c >= 'A' && c <= 'Z') Capital_letter = true;
            if (c == ' ' || c == '/') space_slash = true;
            if (str[0] <= 9) staring_num = true;
        }
        if(size && Numeric_Digit && Capital_letter && !space_slash && !staring_num){
            return 1;
        }
        return 0;
    }
}
