package Subsets.Permuations.Permutations_available;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Permutations("","abc");

    }
    public static void Permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f = p.substring(0,i);
            String l = p.substring(i);
            Permutations(f + ch + l, up.substring(1));
        }
    }
}
