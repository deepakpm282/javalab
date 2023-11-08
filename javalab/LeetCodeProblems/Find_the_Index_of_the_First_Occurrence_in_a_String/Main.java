package LeetCodeProblems.Find_the_Index_of_the_First_Occurrence_in_a_String;

public class Main {
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }
    public static int strStr(String haystack, String needle) {
        return helper(haystack,needle,0);
    }
    static int helper(String up,String needle,int index){
        if(up.isEmpty()){
            return -1;
        }
        char ch = up.charAt(0);
        if(up.startsWith(needle)){
            return index;
        }
        return helper(up.substring(1),needle,index+1);
    }
}
