package Strings_and_Subsets.Renoving_specific_Character;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("abrappcappledabra"));
    }
    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }

    static String skip1(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip1(str.substring(1));
        }
        else{
            return ch + skip1(str.substring(1));
        }
    }
    static String skipApple(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        String a = "apple";
        int len  = a.length();
        if(str.startsWith(a)){
            return skipApple(a.substring(len));
        } else {
            return  ch + skipApple(str.substring(1));
        }
    }
    static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return "";
        }
        String a = "app";
        char ch = str.charAt(0);
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(a.length()));
        }
        else{
            return ch + skipAppNotApple(str.substring(1));
        }
    }
}
