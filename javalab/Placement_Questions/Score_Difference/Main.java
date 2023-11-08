package Placement_Questions.Score_Difference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,6,2,3,5};
        System.out.println(score(5,arr));
    }
    public static int score(int n,int[] seq){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int value : seq){
            arr.add(value);
        }
        int firstScore = 0;
        int secondScore = 0;
        boolean isFirstPlayerTurn = true;

        while (n > 0) {
            int currentNumber = arr.get(0);
            arr.remove(0);

            if (isFirstPlayerTurn) {
                firstScore += currentNumber;
            } else {
                secondScore += currentNumber;
            }

            if (currentNumber % 2 == 0) {
                Collections.reverse(arr);
            }

            isFirstPlayerTurn = !isFirstPlayerTurn;
            n--;
        }

        return firstScore - secondScore;
    }
}
