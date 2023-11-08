package Placement_Questions.Random_web_Question.FinD_Count;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12,3,14,56,77,13};
        System.out.println(Finding_Count(arr,13,2));
    }
    public static int Finding_Count(int[] arr,int num, int diff){
        int count = 0;
        for (int j : arr) {
            if (Math.abs(num - j) <= diff) count++;
        }
        if(count  == 0) return -1;
        return count;
    }
}
