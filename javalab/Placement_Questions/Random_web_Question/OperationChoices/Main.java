package Placement_Questions.Random_web_Question.OperationChoices;

public class Main {
    public static void main(String[] args) {
        System.out.println(OperationChoices(4,2,6));
    }
    public static int OperationChoices(int c, int a , int b ){
        return switch (c) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> a / b;
            default -> 0;
        };
    }
}