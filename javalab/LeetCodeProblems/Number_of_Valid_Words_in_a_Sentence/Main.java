package LeetCodeProblems.Number_of_Valid_Words_in_a_Sentence;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        String sentence = "!this  1-s b8d!";
        System.out.println(countValidWords(sentence));
    }
    public static int countValidWords(String sentence) {
        String[] str = sentence.split("\\s+");
        int count = 0;
        for(String ch : str){
            int punctuations = 0;
            int hyphen = 0;
            for (int i = 0; i < ch.length(); i++) {
                if(ch.charAt(i) == '-' && ch.charAt(0) != '-'){
                    hyphen += 1;
                }
                if((ch.charAt(i) == '!' || ch.charAt(i) == '.' || ch.charAt(i) == ',') && (ch.charAt(ch.length()-1) == '!' || ch.charAt(ch.length()-1) == '.' || ch.charAt(ch.length()-1) == ',' )){
                    punctuations += 1;
                }
                if(hyphen < 1 && punctuations < 1 && ch.charAt(0) >= 'a' && ch.charAt(ch.length()-1) <= 'z'){
                    continue;
                }
                count+=1;
            }
        }
        return count;
    }
}
