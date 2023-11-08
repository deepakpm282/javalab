package Placement_Questions.Random_web_Question.String_Palindrome;

public class Main {
    public static void main(String[] args) {
        System.out.println(Palindrome("abca"));
    }
    public static boolean Palindrome(String str){
        String str1 = "";
        for (int i = str.length()-1; i >=0  ; i--) {
            str1 += str.charAt(i);
        }
        return str1.equals(str);
    }
}
