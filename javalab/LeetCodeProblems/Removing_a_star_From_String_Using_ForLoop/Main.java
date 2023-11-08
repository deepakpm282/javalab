package LeetCodeProblems.Removing_a_star_From_String_Using_ForLoop;

public class Main {
    public static void main(String[] args) {
        System.out.println(Remove_stars("leet**cod*e"));
    }
    public static String Remove_stars(String str){
        String up = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '*'){
                up=up.substring(0,up.length()-1);
            }
            else{
                up+=ch;
            }
        }
        return up;
    }
}
