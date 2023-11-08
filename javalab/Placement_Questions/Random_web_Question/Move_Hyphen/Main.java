package Placement_Questions.Random_web_Question.Move_Hyphen;

public class Main {
    public static void main(String[] args) {
        System.out.println(move("Str-ing-Com-pare"));
    }
    public static String move(String str){
        char[] arr = str.toCharArray();
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        for (char c : arr) {
            if (c == '-') {
                left.append(c);
            } else {
                right.append(c);
            }
        }
        return left.append(right).toString();
    }
}
