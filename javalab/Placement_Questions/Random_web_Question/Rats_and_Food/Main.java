package Placement_Questions.Random_web_Question.Rats_and_Food;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,8,3,5,7,4,1,2};
        System.out.println(Till_Rats_full(7,2,arr));
    }
    public static int Till_Rats_full(int r,int unit,int[] arr){
        if(arr.length == 0) return -1;
        int food_needed = unit * r;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            if(total > food_needed) return i+1;
        }
        return -1;
    }
}
