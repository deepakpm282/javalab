package Placement_Questions.Random_web_Question.Contains_Three;

public class Main {
    public static void main(String[] args) {
        System.out.println(count_3(45));
    }
    public static int count_3(int n){
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if(contains_3(i)){
                continue;
            } else {
                count++;
            }
        }
        return count;
    }
    public static boolean contains_3(int n){
        while(n > 0){
            if(n % 10 == 3){
                return true;
            }
            n/=10;
        }
        return false;
    }
}

