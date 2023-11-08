package Team_Formation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            int[] arr = {8,6,18,8,14,10,12,18,9,8,3};
//            int[] arr = {9,17,12,10,2,7,2,11,20,8,3,4};
            List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            list.add(j);
        }
        System.out.println(team_formation(list,3,4));
    }
    public static long team_formation(List<Integer> score,int team_size,int k){
        long sum = 0;
        List<Integer> newlist = new ArrayList<>();
        return helper(score, team_size, k, sum);
    }
    public static long helper(List<Integer> score,int team_size,int k,long sum){
        if(team_size == 0){
            return sum;
        }
        List<Integer> left = new ArrayList<>(score.subList(0,k));
        List<Integer> mid = new ArrayList<>(score.subList(k,score.size()-k));
        List<Integer> right = new ArrayList<>(score.subList(score.size()-k, score.size()));

        int max1 = max(left);
        int max2 = max(right);

        left.addAll(mid);
        left.addAll(right);

        if(max1 > max2){
            left.remove(Integer.valueOf(max1));
            return helper(left,team_size-1,k,sum += max1);
        } else {
            left.remove(Integer.valueOf(max2));
            return helper(left, team_size-1, k,sum += max2);
        }
    }
    public static int max(List<Integer> list){
        int maxVal = Integer.MIN_VALUE;
        for(Integer value : list){
            if(value > maxVal){
                maxVal = value;
            }
        }
        return maxVal;
    }
}
