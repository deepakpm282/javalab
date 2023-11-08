package LeetCodeProblems.Valid_mail_or_not;

import Pattern_questions.Patterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String email = "iamdeepakpm282@gmail.com";
        System.out.println(isValidOrNot(email));
    }
    public static Boolean isValidOrNot(String email){
        String regex = "^[a-zA-Z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
