package LeetCodeProblems.Goal_Parser_Interpretation;

public class Main {
    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
    }
    static String interpret(String command) {
        return helper("",command);
    }
    static String helper(String p, String up){
        if(up.isEmpty()){
            return p;
        }
        if(up.startsWith("G")){
            return helper(p+"G",up.substring(1));
        }
        if(up.startsWith("()")){
            return helper(p+"o",up.substring(2));
        }
        if(up.startsWith("(al)")){
            return helper(p+"al",up.substring(4));
        }
        return p;
    }
}
