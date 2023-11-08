package LeetCodeProblems.Reverse_Words_in_a_String;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWords("Hello iam     deepak"));
    }
    public static String reverseWords(String s) {
        String[] str = s.split("\\s+");
        System.out.println(Arrays.toString(str));
        int start = 0;
        int end = str.length-1;
        while(start < end){
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        StringBuilder string = new StringBuilder();
        for(String ch : str){
                string.append(ch).append(" ");
        }

        return string.toString().trim();
    }
}
