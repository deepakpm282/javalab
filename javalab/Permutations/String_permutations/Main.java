package Permutations.String_permutations;

public class Main {
    public static void main(String[] args) {
        ways("","abc");
    }
    public static void ways(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i = 0; i<=p.length();i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);
            ways(first+ch+second,up.substring(1));
        }
    }
}
