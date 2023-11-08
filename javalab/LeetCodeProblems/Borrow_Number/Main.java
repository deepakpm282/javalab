package LeetCodeProblems.Borrow_Number;

public class Main {
    public static void main(String[] args) {
        System.out.println(borrowNumber(500,482));
    }
    public static int borrowNumber(int num1, int num2){
        if(num2 > num1){
            return -1;
        }
        int count = 0;
        while(num1 != 0 && num2!= 0) {
            int temp1 = num1 % 10;
            int temp2 = num2 % 10;
            if (temp1 < temp2) {
                count++;
            }
            num1/=10;
            num2/=10;
        }
        return count;
    }

}
