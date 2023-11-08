package Linearsearch;
import java.lang.String;
import java.util.*;


public class stringsearch {
    public static void main(String[] args) {
        String words = "Deepak";
        char target = 'p';
        boolean c = search(words,target);
        System.out.println(c);
    }
//    static boolean search (String str,char target){
//        if(str.length()==0){
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if(target == str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }
static boolean search (String str,char target){
    if(str.length()==0){
        return false;
    }
    for (char ch:str.toCharArray()) {
        if(ch == target){
            return true;
        }
    }
    return false;
    }
}
