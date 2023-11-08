package Subsets.Subset_of_a_set;

public class Main {
    public static void main(String[] args) {
        Subset("","pak");
    }

    static void Subset(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        Subset(p+ch,up.substring(1));
        Subset(p,up.substring(1));
    }
}