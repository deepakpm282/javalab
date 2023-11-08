package LeetCodeProblems.Removing_a_star_From_String;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        System.out.println(RemoveStar("leet*cod*e",0));
    }
    public static String RemoveStar(String str, int index){
        if(index == str.length()){
            return "";
        }
        return null;
    }
}
