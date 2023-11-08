package Placement_Questions.Random_web_Question.Replace_Character;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(replace("apples",'a','p'));
    }
    public static String replace(String string, char ch1, char ch2 ){
        char[] str =  string.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if(str[i] == ch1){
                str[i] = ch2;
            } else if(str[i] == ch2){
                str[i] = ch1;
            } else {
                continue;
            }
        }
        return new String(str);
    }
}
