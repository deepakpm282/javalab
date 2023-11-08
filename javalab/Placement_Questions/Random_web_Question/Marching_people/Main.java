package Placement_Questions.Random_web_Question.Marching_people;

public class Main {
    public static void main(String[] args) {

    }
    public static void blocked(int n,int x,int y,int d){
        int count = 0;
        for (int i = 1; i < 10; i++) {
            if(i >= x && i <= x+d){
                count+=1;
            }
        }
    }
}
