package Subsets.Subset_as_ArrayList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }
    static ArrayList<String> Subset(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> right = Subset(ch + p,up.substring(1));
        ArrayList<String> left = Subset( p,up.substring(1));

        left.addAll(right);

        return left;
    }
}
