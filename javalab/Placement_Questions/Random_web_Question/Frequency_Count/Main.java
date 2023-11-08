package Placement_Questions.Random_web_Question.Frequency_Count;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(count("bcbbdeffb"));
    }
    public static String count(String str){
        StringBuilder string = new StringBuilder();
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            char ch = str.charAt(i);
            if(arr.contains(ch)){
                continue;
            }
            arr.add(ch);
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(j) == ch){
                    count+=1;
                }
            }
            string.append(ch);
            string.append(count);
        }
        return string.toString();
    }
}
