package LeetCodeProblems.Split_a_String_in_Balance_Strings;

public class Main {
    public static void main(String[] args) {
        String str = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(str));
    }
    static int balancedStringSplit(String s) {
        int r=0;
        int l = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'R'){
                r++;
            } else {
                l++;
            }
            if(l == r ){
                count++;
            }
        }
        return count;
    }
}
