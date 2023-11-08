package Subsets.Subsets_with_ascii_Value;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SubSetWithAscii("","ab");
    }
    public static ArrayList<String> SubSetWithAscii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = SubSetWithAscii(p +ch , up.substring(1));
        ArrayList<String> second = SubSetWithAscii(p , up.substring(1));
        ArrayList<String> third = SubSetWithAscii(p +(ch+0) , up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
