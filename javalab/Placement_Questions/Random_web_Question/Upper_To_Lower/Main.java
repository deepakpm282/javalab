package Placement_Questions.Random_web_Question.Upper_To_Lower;

public class Main {
    public static void main(String[] args) {
        System.out.println(split("startTheFile"));
    }
    public static String split(String str){
        String string = "";
        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                string += "\n";
                ch = Character.toLowerCase(ch);
            } else {
                ch = Character.toUpperCase(ch);
            }
            string += ch;
        }
        return string;
    }
}
