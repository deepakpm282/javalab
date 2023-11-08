package Placement_Questions.Random_web_Question.Closest_Divisible_number;

public class Main {
    public static void main(String[] args) {
        System.out.println(Smallest(67,8));
    }
    public static int Smallest(int num ,int m){
        int In_back = 0;
        int In_forw = 0;
        for(int rev = num-1 ; rev >= num-m ; rev--){
            if(rev % m == 0){
                In_back = rev;
                break;
            }
        }
        for(int forw = num+1 ; forw <= num+m ; forw++){
            if(forw % m == 0){
                In_forw = forw;
                break;
            }
        }
        int smaller_Val = 0;
        if(In_forw - num < In_back - num){
            return In_forw;
        }
        return In_back;
    }
}
