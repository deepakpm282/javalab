package Placement_Questions.Random_web_Question.Large_Small_Sum;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,1,7,5,4};
        System.out.println(difference(arr));
    }
    public static int difference(int[] arr){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
         for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0) even.add(arr[i]); else odd.add(arr[i]);
        }
         Collections.sort(even);
         Collections.sort(odd);
         System.out.println(even);
         System.out.println(odd);

     return even.get(even.size()-2) + odd.get(1);
    }
}
