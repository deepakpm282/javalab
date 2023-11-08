package Placement_Questions.Random_web_Question.Number_rem;

public class Main {
    public static void main(String[] args) {
        System.out.println(rem("1345"));
    }
    public static int rem(String str){
        int digits  = str.length()-1;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
             num += ((int)Math.pow(10,digits))*(str.charAt(i)-'0');
             digits--;
        }
        return num%11;
    }
}
