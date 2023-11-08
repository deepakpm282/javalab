package LeetCodeProblems.Maximum_Number_of_Words_Found_in_Sentences;

import java.util.Arrays;
import java.lang.String;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
    static int mostWordsFound(String[] sentences) {
        int words = 0;
        for(String t : sentences){
            StringTokenizer str = new StringTokenizer(t," ");
        words = Math.max(words, str.countTokens());
        }
        return words;
    }
}
