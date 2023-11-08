package Placement_Questions.Random_web_Question.Hungry_sequence;

public class Main {
    public static void main(String[] args) {
        Hungry_Numbers(4);
    }
    public static void Hungry_Numbers(int n){
        for (int i = n+1; i <= 2*n; i++) {
            for (int j = i+1; j <=2*n; j++) {
                if(j % i != 0){
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }
}
