package LeetCodeProblems.Capitalize_Decapitalize;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 ="helloworld";
        char[] string = new char[str1.length()];
        System.out.println(capOrDecap(str1,'l',string));
    }
    public static String capOrDecap(String str,char p,char[] string){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == p){
                if(Character.isUpperCase(arr[i])){
                    string[i] = Character.toLowerCase(arr[i]);
                } else {
                    string[i] = Character.toUpperCase(arr[i]);
                }
            } else {
                string[i] = arr[i];
            }
        }
        return new String(string);
    }
}
