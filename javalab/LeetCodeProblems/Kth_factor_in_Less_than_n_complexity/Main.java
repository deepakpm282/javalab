package LeetCodeProblems.Kth_factor_in_Less_than_n_complexity;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(kthFactor(4,4));
    }
    public static int kthFactor(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        for (int i = (int)Math.sqrt(n); i >0 ; i--) {
            if(n % i == 0){
                if(arr.contains(n/i)){
                    continue;
                } else {
                    arr.add(n/i);
                }
            }
        }
        Collections.sort(arr);
        if(arr.size() < k){
            return -1;
        }
        return arr.get(k - 1);
    }
}
